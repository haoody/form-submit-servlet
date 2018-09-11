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

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author lai
 * @time 2018/9/11 16:39
 * @description
 * @modified
 */
@Builder
@Data
public class ObjData implements Serializable {

    private int id;

    private String name;

    private String descript;
}
