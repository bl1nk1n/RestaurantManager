package cs2114.restaurantmanager;

import sofia.graphics.Color;
import android.graphics.RectF;
import sofia.app.Screen;
import android.widget.*;
import sofia.app.ScreenLayout;

public class ManagerScreen
    extends Screen
{

    public void initialize()
    {

    }


    public void managerToMenuClicked()
    {
        presentScreen(MainScreen.class);
        finish();
    }
}