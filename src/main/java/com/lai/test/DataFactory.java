/*
 *  Licensed to the Shenzhen Zhouxun Information Technology Co., Ltd. (SZZX).
 *  you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      https://www.zxxxjs.com/licenses/LICENSE-2.0
 *
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.lai.test;

import lombok.Getter;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lai
 * @time 2018/9/11 16:40
 * @description
 * @modified
 */
@WebListener
public class DataFactory implements ServletContextListener {

    @Getter
    private static List<ObjData> datalist = new ArrayList<>();

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        for (int i=0;i<3;i++){
            DataFactory.datalist.add(ObjData.builder().id(i+1).name("名称"+i).descript("描述"+1).build());
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }

    public static void addItem(String name, String descript){
        DataFactory.datalist.add(ObjData.builder().id(DataFactory.datalist.size()+1).name(name).descript(descript).build());
    }
}
