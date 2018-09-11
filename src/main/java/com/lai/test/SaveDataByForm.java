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

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author lai
 * @time 2018/9/11 17:02
 * @description
 * @modified
 */
@WebServlet("/saveForm")
public class SaveDataByForm extends AbstractAddItem {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        addDataItem(req);
        resp.sendRedirect("/");
    }
}
