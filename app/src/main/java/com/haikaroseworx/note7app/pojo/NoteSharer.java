package com.haikaroseworx.note7app.pojo;

import android.content.Context;
import android.content.Intent;

import static android.content.Intent.ACTION_SEND;
import static android.content.Intent.EXTRA_TEXT;

/**
 * Created by hikaroseworx on 1/6/18.
 */

public class NoteSharer {
    public static void shareNote(Context context, NoteItem noteItem){

        Intent intent = new Intent(ACTION_SEND);
        intent.setType("text/html");
        intent.putExtra(EXTRA_TEXT,noteItem.getTitle()+" :: "+noteItem.getNote());
        context.startActivity(Intent.createChooser(intent,"Share note using"));
    }
public void dosomething(){

}

public void code(){

}

public interface MyInterface {
   default myDummyMethod() {
      // nada
   }
}

public void bar(int num1, int num2) {
    //...
}

}
