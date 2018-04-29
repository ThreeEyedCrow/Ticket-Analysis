package cn.midnight.ticketsystem.presenter.view;

import cn.midnight.ticketsystem.base.ILoadingView;
import cn.midnight.ticketsystem.bean.TicketOpenData;
import cn.midnight.ticketsystem.bean.TicketRegular;

/**
 * @author xiaolong
 * @version v1.0
 * @function <描述功能>
 * @date: 2017/9/8 15:02
 */

public interface IOpenResultView extends ILoadingView {
    void getSingleOpenResultSuccess(TicketOpenData ticketOpenData);

    void getRegularSuccess(TicketRegular ticketRegular);
}
