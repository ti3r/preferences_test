/*
 * Copyright Alexandro Blanco <ti3r.bubblenet@gmail.com>, 2011 
 * This file is part of preferences_test.
 * preferences_test is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * preferences_test is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with preferences_test.  If not, see <http://www.gnu.org/licenses/>.
 */
package blanco.prefs.test;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.preference.PreferenceManager;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        startActivity(new Intent(this,PrefActivity.class));
        Editor editor = PreferenceManager.getDefaultSharedPreferences(this).edit();
        editor.putString("text", "Algo con el texto");
        editor.commit();
    }
}