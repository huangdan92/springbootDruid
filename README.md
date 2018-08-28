# mybatisboot
    SpringBoot + MyBatis + Druid
# Spring Boot 项目启动图
![Spring Boot 项目启动图](https://github.com/niaonao/ImageIcon/blob/master/IDEAProject/MybatisBoot/20180828113901_startUp.jpg)
# Postman 接口测试图
![Postman 接口测试图](https://github.com/niaonao/ImageIcon/blob/master/IDEAProject/MybatisBoot/20180828113902_getEOUser.jpg)
# 数据库脚本
1> 数据库

    MySQL5.7
2> 脚本

    -- ----------------------------
    -- Table structure for eo_user
    -- ----------------------------
    DROP TABLE IF EXISTS `eo_user`;
    CREATE TABLE `eo_user`  (
      `userID` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
      `userName` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
      `userPassword` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
      `userNickName` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
      PRIMARY KEY (`userID`) USING BTREE
    ) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;
    
    -- ----------------------------
    -- Records of eo_user
    -- ----------------------------
    INSERT INTO `eo_user` VALUES (1, 'eolinker', '123456', 'eolinker');
    INSERT INTO `eo_user` VALUES (2, 'eolinkeros', '123456', 'eolinkeros');
    INSERT INTO `eo_user` VALUES (3, 'chicheese', '123456', 'cheese');
    INSERT INTO `eo_user` VALUES (4, 'jamace', '123456', 'jamace');
    INSERT INTO `eo_user` VALUES (5, 'gf', '123456', 'gf');
    INSERT INTO `eo_user` VALUES (6, 'qkc', '123456', 'qkc');
    INSERT INTO `eo_user` VALUES (7, 'hyf', '123456', 'hyf');
    INSERT INTO `eo_user` VALUES (8, 'xxj', '123456', '笑傲江湖');
    INSERT INTO `eo_user` VALUES (9, 'Song790274526', '123456', '少年与谁');
    INSERT INTO `eo_user` VALUES (10, 'qqq', '123456', 'qqq');
    INSERT INTO `eo_user` VALUES (11, 'qqqq', '123456', 'qqqq');
    INSERT INTO `eo_user` VALUES (12, 'cwc', '123456', 'caicai');
    INSERT INTO `eo_user` VALUES (13, 'C', '123456', '');
    INSERT INTO `eo_user` VALUES (14, 'meissi', '123456', '梅西');
    INSERT INTO `eo_user` VALUES (15, 'meissi', '123456', '');
    
    SET FOREIGN_KEY_CHECKS = 1;

# 接口测试脚本
1> 测试工具

    Postman
2> 脚本

    此处使用Postman 测试通过，导出json 格式的测试数据脚本
    {
        "id": "5be0a233-5118-40f7-9cfd-521c842c4fd3",
        "name": "MyBatisBoot",
        "description": "",
        "auth": null,
        "events": null,
        "variables": [],
        "order": [
            "7c3ebbd2-8c38-4a28-bcdd-e5270ecc0ea8",
            "db3d2eca-210e-498c-8bd1-2bb0ce4551ef",
            "b4239eab-6498-45c1-b479-fc1e085db9bb",
            "6d5eb4c0-d1b7-43d1-80aa-5285c1d3f4bb",
            "00eba0da-391a-4d92-8b5a-c3a5db689387"
        ],
        "folders_order": [],
        "folders": [],
        "requests": [
            {
                "id": "00eba0da-391a-4d92-8b5a-c3a5db689387",
                "name": "http://localhost:8082/manage/eouser/getEOUserList",
                "url": "http://localhost:8082/manage/eouser/getEOUserList",
                "description": null,
                "data": [],
                "dataMode": "raw",
                "headerData": [
                    {
                        "key": "Content-Type",
                        "value": "application/json"
                    }
                ],
                "method": "POST",
                "pathVariableData": [],
                "queryParams": [],
                "auth": null,
                "events": null,
                "folder": null,
                "rawModeData": "{\r\n  \"treasureData\": \"{\\\"userId\\\":\\\"2018071211901119030\\\"}\"\r\n}",
                "headers": "Content-Type: application/json\n",
                "pathVariables": {}
            },
            {
                "id": "6d5eb4c0-d1b7-43d1-80aa-5285c1d3f4bb",
                "name": "http://localhost:8082/manage/eouser/updateEOUser",
                "url": "http://localhost:8082/manage/eouser/updateEOUser",
                "description": "更新用户",
                "data": [],
                "dataMode": "raw",
                "headerData": [
                    {
                        "key": "Content-Type",
                        "value": "application/json"
                    }
                ],
                "method": "POST",
                "pathVariableData": [],
                "queryParams": [],
                "auth": null,
                "events": [],
                "folder": null,
                "rawModeData": "{\r\n  \"treasureData\": \"{\\\"userName\\\":\\\"meisi\\\",\\\"userNickName\\\":\\\"梅西\\\",\\\"userPassword\\\":\\\"123456\\\"}\"\r\n}",
                "headers": "Content-Type: application/json\n",
                "pathVariables": {}
            },
            {
                "id": "7c3ebbd2-8c38-4a28-bcdd-e5270ecc0ea8",
                "name": "http://localhost:8082/user/getEOUser",
                "url": "http://localhost:8082/manage/eouser/addEOUser",
                "description": "获取用户信息",
                "data": [],
                "dataMode": "raw",
                "headerData": [
                    {
                        "key": "Content-Type",
                        "value": "application/json"
                    }
                ],
                "method": "POST",
                "pathVariableData": [],
                "queryParams": [],
                "auth": null,
                "events": [],
                "folder": null,
                "rawModeData": "{\r\n  \"treasureData\": \"{\\\"userName\\\":\\\"meissi\\\",\\\"userPassword\\\":\\\"123456\\\"}\"\r\n}",
                "headers": "Content-Type: application/json\n",
                "pathVariables": {}
            },
            {
                "id": "b4239eab-6498-45c1-b479-fc1e085db9bb",
                "name": "http://localhost:8082/manage/eouser/getEOUserList",
                "url": "http://localhost:8082/manage/eouser/getEOUserList",
                "description": "获取用户列表",
                "data": [],
                "dataMode": "raw",
                "headerData": [
                    {
                        "key": "Content-Type",
                        "value": "application/json"
                    }
                ],
                "method": "POST",
                "pathVariableData": [],
                "queryParams": [],
                "auth": null,
                "events": [],
                "folder": null,
                "rawModeData": "{\r\n  \"treasureData\": \"{}\"\r\n}",
                "headers": "Content-Type: application/json\n",
                "pathVariables": {}
            },
            {
                "id": "db3d2eca-210e-498c-8bd1-2bb0ce4551ef",
                "name": "http://localhost:8082/manage/eouser/getEOUser",
                "url": "http://localhost:8082/manage/eouser/getEOUser",
                "description": "获取用户",
                "data": [],
                "dataMode": "raw",
                "headerData": [
                    {
                        "key": "Content-Type",
                        "value": "application/json"
                    }
                ],
                "method": "POST",
                "pathVariableData": [],
                "queryParams": [],
                "auth": null,
                "events": [],
                "folder": null,
                "rawModeData": "{\r\n  \"treasureData\": \"{\\\"userName\\\":\\\"meissi\\\"}\"\r\n}",
                "headers": "Content-Type: application/json\n",
                "pathVariables": {}
            }
        ]
    }
