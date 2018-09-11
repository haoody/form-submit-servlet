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

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * @author lai
 * @time 2018/9/11 16:47
 * @description
 * @modified
 */
public class AbstractAddItem extends HttpServlet {

    protected void addDataItem(HttpServletRequest request) {
        DataFactory.addItem(request.getParameter("name"), request.getParameter("descript"));
    }
}
