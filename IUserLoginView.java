package test.bwie.com.login_mvp.view;

import test.bwie.com.login_mvp.bean.User;

/**
 * date: 2017/5/16
 * author:陈茹
 * 类的用途:
 */

public interface IUserLoginView
{
    String getUserName();

    String getPassword();

    void clearUserName();

    void clearPassword();

    void showLoading();

    void hideLoading();

    void toMainActivity(User user);

    void showFailedError();

}
