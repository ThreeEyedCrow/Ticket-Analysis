package cn.midnight.ticketsystem.presenter;

import android.app.Activity;

import com.google.gson.Gson;
import com.standards.library.cache.SPHelp;

import java.util.List;

import cn.midnight.ticketsystem.BuildConfig;
import cn.midnight.ticketsystem.base.BasePresenter;
import cn.midnight.ticketsystem.bean.TicketRegular;
import cn.midnight.ticketsystem.bean.TicketType;
import cn.midnight.ticketsystem.manager.TicketTypeDataManager;
import cn.midnight.ticketsystem.presenter.view.IFollowAddView;
import cn.midnight.ticketsystem.presenter.view.INumberGenerateView;
import cn.midnight.ticketsystem.utils.NumberGenerateHelper;

/**
 * @author xiaolong
 * @version v1.0
 * @function <描述功能>
 * @date: 2017/09/11 11:10:50
 */

public class NumberGeneratePresenter extends BasePresenter<INumberGenerateView> {
    private NumberGenerateHelper numberGenerateHelper;

    public NumberGeneratePresenter(Activity activity, TicketRegular regular) {
        super(activity);
        numberGenerateHelper = new NumberGenerateHelper(regular);
    }

    public void generaterNumber(List<List<String>> numberBase) {
        addSubscribe(numberGenerateHelper.generateNumberGroup(numberBase).subscribe(getSubscriberNoProgress(t ->
                mView.onGenerateDataSuccess(t)
        )));
    }

}
