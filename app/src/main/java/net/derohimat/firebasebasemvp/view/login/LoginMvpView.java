package net.derohimat.firebasebasemvp.view.login;

import net.derohimat.firebasebasemvp.view.MvpView;

/**
 * Created by derohimat on 23/05/2016.
 */
interface LoginMvpView extends MvpView {

    void showProgress();

    void hideProgress();

    void initFbLoginButton();

    void initTwitterLoginButton();
}
