/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package net.ruixinglong.suntv;

import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.pili.pldroid.player.AVOptions;
import com.pili.pldroid.player.widget.PLVideoView;


/*
 * Main Activity class that loads {@link MainFragment}.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PLVideoView mVideoView = (PLVideoView) findViewById(R.id.PLVideView);
        Uri uri = Uri.parse("http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4");
        AVOptions options = new AVOptions();
//        options.setInteger(AVOptions.KEY_PREFER_FORMAT, 1);
        mVideoView.setAVOptions(options);
        mVideoView.setVideoURI(uri);
        mVideoView.start();
    }
}
