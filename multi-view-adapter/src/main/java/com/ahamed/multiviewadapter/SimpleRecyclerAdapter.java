/*
 * Copyright 2017 Riyaz Ahamed
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ahamed.multiviewadapter;

import java.util.List;

/**
 * SimpleAdapter is an easy way to set-up adapters which has single view types
 *
 * @param <M> Model class to be displayed
 * @param <B> ItemBinder class
 */
public final class SimpleRecyclerAdapter<M, B extends ItemBinder> extends SelectableAdapter {

  private final DataListManager<M> dataListManager = new DataListManager<>(this);

  public SimpleRecyclerAdapter(B binder) {
    addDataManager(dataListManager);
    registerBinder(binder);
  }

  /**
   * Returns the DataListManager on which list operations can be made. It will call necessary item
   * animations.
   *
   * @return DataListManager
   */
  public final DataListManager<M> getDataManager() {
    return dataListManager;
  }

  /**
   * Sets the data list to the data manager.
   *
   * @param dataList Data list to be set
   */
  public final void setData(List<M> dataList) {
    dataListManager.set(dataList);
  }
}
