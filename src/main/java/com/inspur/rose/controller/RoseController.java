package com.inspur.rose.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 对外输出接口
 * @author zhaozeteng
 * @since 2021-12-24
 */
@RestController
@RequestMapping("/rose")
public class RoseController {

    /**
     * 根据设备id获取设备信息
     * @param id 设备id
     * @return Map<String, Object>
     */
    @RequestMapping("/getRoseInfoById")
    public Map<String, Object> rose(String id) {

        if (id.equals("1")) {
            Map<String, Object> map = new HashMap() {{
                put("batchId", "2021111111");
                put("dryType", "0");
                put("dryRoom", "烘房1");
                put("dryTmp", "55");
                put("dryTimp", "6.5");
                put("waterContent", "20%");
            }};

            List<Map<String, Object>> list = new ArrayList<>();
            list.add(new HashMap() {{
                put("rankId", "1");
                put("beforeDrying","5.2");
                put("afterDrying","4.1");
            }});
            list.add(new HashMap(){{
                put("rankId", "2");
                put("beforeDrying","6.7");
                put("afterDrying","5.4");
            }});

            map.put("ranks", list);
            return map;
        } else {
            return null;
        }
    }

}
