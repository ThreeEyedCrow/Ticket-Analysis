package cn.midnight.ticketsystem.presenter.view;

import java.util.List;

import cn.midnight.ticketsystem.base.ILoadingView;
import cn.midnight.ticketsystem.bean.TicketOpenData;

/**
 * @author xiaolong
 * @version v1.0
 * @function <描述功能>
 * @date: 2017/9/14 14:59
 */

public interface IParityTrendView extends ILoadingView {
    void onGetHistoryRecentTicketListSuccess(List<TicketOpenData> list);
}
