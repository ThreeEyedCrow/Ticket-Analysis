package cn.midnight.ticketsystem.presenter;

import android.app.Activity;

import com.standards.library.util.TimeUtils;

import cn.midnight.ticketsystem.api.DataManager;
import cn.midnight.ticketsystem.base.BasePresenter;
import cn.midnight.ticketsystem.presenter.view.IParityTrendView;

/**
 * @author xiaolong
 * @version v1.0
 * @function <描述功能>
 * @date: 2017/9/14 14:58
 */

public class ParityTrendPresenter extends BasePresenter<IParityTrendView> {
    public ParityTrendPresenter(Activity activity) {
        super(activity);
    }

    public void getRecentOpenDatas(String ticketCode, String count) {
        addSubscribe(DataManager.getMutiPeriodCheck(ticketCode, count, TimeUtils.milliseconds2String(System.currentTimeMillis()))
                .subscribe(getSubscriber(ticketOpenDataListData -> {
                    mView.onGetHistoryRecentTicketListSuccess(ticketOpenDataListData.list);
                })));
    }
}
