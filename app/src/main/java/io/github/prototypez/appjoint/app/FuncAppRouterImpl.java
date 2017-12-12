package io.github.prototypez.appjoint.app;

import android.util.Log;

import io.github.prototypez.appjoint.core.RouterProvider;
import io.github.prototypez.router.FuncAppRouter;

/**
 * Created by zhounl on 2017/12/12.
 */
@RouterProvider
public class FuncAppRouterImpl implements FuncAppRouter {


    @Override
    public void callApp() {
        Log.i("AppJoint", "call App!");
    }
}
