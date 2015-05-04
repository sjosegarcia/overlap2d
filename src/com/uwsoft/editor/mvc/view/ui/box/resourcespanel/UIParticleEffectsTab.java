/*
 * ******************************************************************************
 *  * Copyright 2015 See AUTHORS file.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *   http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *  *****************************************************************************
 */

package com.uwsoft.editor.mvc.view.ui.box.resourcespanel;

import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.Array;
import com.kotcrab.vis.ui.widget.VisList;
import com.kotcrab.vis.ui.widget.VisTable;
import com.kotcrab.vis.ui.widget.tabbedpane.Tab;

/**
 * Created by azakhary on 4/17/2015.
 */
public class UIParticleEffectsTab extends Tab {

    private VisTable contentTable;

    private VisList<String> list;

    public UIParticleEffectsTab() {
        super(false, false);

        contentTable = new VisTable();

        contentTable.setWidth(250);

        list = new VisList<>();
        contentTable.add(list);
    }

    @Override
    public String getTabTitle() {
        return " Particles ";
    }

    @Override
    public Table getContentTable() {
        return contentTable;
    }

    public void setItems(Array<String> items) {
        list.setItems(items);
    }
}
