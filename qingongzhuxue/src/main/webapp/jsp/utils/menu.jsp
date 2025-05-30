<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

var menus = [

	{
        "backMenu":[
            {
                "child":[
                    {
                        "buttons":[
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"管理员管理",
                        "menuJump":"列表",
                        "tableName":"users"
                    }
                ],
                "menu":"管理员信息"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"部门管理员管理",
                        "menuJump":"列表",
                        "tableName":"bumenguanli"
                    }
                ],
                "menu":"部门管理员管理"
            }
			,{
			    "child":[
			        {
			            "buttons":[
			                "查看",
			                "新增",
			                "修改",
			                "删除"
			            ],
			            "menu":"用户管理",
			            "menuJump":"列表",
			            "tableName":"yonghu"
			        }
			    ],
			    "menu":"用户管理"
			}
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"岗位信息管理",
                        "menuJump":"列表",
                        "tableName":"gangwei"
                    }
                ],
                "menu":"岗位信息管理"
            }
			,{
			    "child":[
			        {
			            "buttons":[
			                "查看",
			                "审核",
			                "删除"
			            ],
			            "menu":"申请审核管理",
			            "menuJump":"列表",
			            "tableName":"shenqingshenhe"
			        }
			    ],
			    "menu":"申请审核管理"
			}
			,{
			    "child":[
			        {
			            "buttons":[
			                "查看",
			                "新增",
			                "修改",
			                "删除"
			            ],
			            "menu":"考核评价管理",
			            "menuJump":"列表",
			            "tableName":"kaohepingjia"
			        }
			    ],
			    "menu":"考核评价管理"
			}
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"工作日志管理",
                        "menuJump":"列表",
                        "tableName":"gongzuo"
                    }
                ],
                "menu":"工作日志管理"
            }
			,{
			    "child":[
			        {
			            "buttons":[
			                "查看",
			                "新增",
			                "修改",
			                "删除"
			            ],
			            "menu":"薪资发放管理",
			            "menuJump":"列表",
			            "tableName":"xinzifafang"
			        }
			    ],
			    "menu":"薪资发放管理"
			}
			,{
			    "child":[
			        {
			            "buttons":[
			                "查看",
			                "新增",
			                "修改",
			                "删除"
			            ],
			            "menu":"岗位类型管理",
			            "menuJump":"列表",
			            "tableName":"dictionaryGangwei"
			        }
			        ,
			        {
			            "buttons":[
			                "查看",
			                "新增",
			                "修改",
			                "删除"
			            ],
			            "menu":"公告类型管理",
			            "menuJump":"列表",
			            "tableName":"dictionaryNews"
			        }
			
			    ],
			    "menu":"基础数据管理"
			}
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"公告信息管理",
                        "menuJump":"列表",
                        "tableName":"news"
                    }
                ],
                "menu":"公告信息管理"
            }
        ],
        "frontMenu":[

        ],
        "roleName":"管理员",
        "tableName":"users"
    }
	,
	{
	    "backMenu":[
	        {
	            "child":[
	                {
	                    "buttons":[
	                        "查看",
	                        "新增",
	                        "修改",
	                        "删除"
	                    ],
	                    "menu":"岗位信息管理",
	                    "menuJump":"列表",
	                    "tableName":"gangwei"
	                }
	            ],
	            "menu":"岗位信息管理"
	        }
			,{
			    "child":[
			        {
			            "buttons":[
			                "查看",
			                "审核"
			            ],
			            "menu":"申请审核管理",
			            "menuJump":"列表",
			            "tableName":"shenqingshenhe"
			        }
			    ],
			    "menu":"申请审核管理"
			}
			,{
			    "child":[
			        {
			            "buttons":[
			                "查看",
			                "新增",
			                "修改"
			            ],
			            "menu":"考核评价管理",
			            "menuJump":"列表",
			            "tableName":"kaohepingjia"
			        }
			    ],
			    "menu":"考核评价管理"
			}
	        ,{
	            "child":[
	                {
	                    "buttons":[
	                        "查看",
			                "删除"
	                    ],
	                    "menu":"工作日志管理",
	                    "menuJump":"列表",
	                    "tableName":"gongzuo"
	                }
	            ],
	            "menu":"工作日志管理"
	        }
			,{
			    "child":[
			        {
			            "buttons":[
			                "查看",
			                "新增",
			                "修改"
			            ],
			            "menu":"薪资发放管理",
			            "menuJump":"列表",
			            "tableName":"xinzifafang"
			        }
			    ],
			    "menu":"薪资发放管理"
			}
	        ,{
	            "child":[
	                {
	                    "buttons":[
	                        "查看"
	                    ],
	                    "menu":"公告信息管理",
	                    "menuJump":"列表",
	                    "tableName":"news"
	                }
	            ],
	            "menu":"公告信息管理"
	        }
	    ],
	    "frontMenu":[
	
	    ],
	    "roleName":"部门管理员",
	    "tableName":"bumenguanli"
	}
	,
	{
	    "backMenu":[
	        {
	            "child":[
	                {
	                    "buttons":[
	                        "查看",
	                        "申请岗位"
	                    ],
	                    "menu":"岗位信息管理",
	                    "menuJump":"列表",
	                    "tableName":"gangwei"
	                }
	            ],
	            "menu":"岗位信息管理"
	        }
			,{
			    "child":[
			        {
			            "buttons":[
			                "查看"
			            ],
			            "menu":"申请审核管理",
			            "menuJump":"列表",
			            "tableName":"shenqingshenhe"
			        }
			    ],
			    "menu":"申请审核管理"
			}
			,{
			    "child":[
			        {
			            "buttons":[
			                "查看"
			            ],
			            "menu":"考核评价管理",
			            "menuJump":"列表",
			            "tableName":"kaohepingjia"
			        }
			    ],
			    "menu":"考核评价管理"
			}
	        ,{
	            "child":[
	                {
	                    "buttons":[
	                        "查看",
	                        "新增",
	                        "修改",
	                        "删除"
	                    ],
	                    "menu":"工作日志管理",
	                    "menuJump":"列表",
	                    "tableName":"gongzuo"
	                }
	            ],
	            "menu":"工作日志管理"
	        }
			,{
			    "child":[
			        {
			            "buttons":[
			                "查看"
			            ],
			            "menu":"薪资发放管理",
			            "menuJump":"列表",
			            "tableName":"xinzifafang"
			        }
			    ],
			    "menu":"薪资发放管理"
			}
	        ,{
	            "child":[
	                {
	                    "buttons":[
	                        "查看"
	                    ],
	                    "menu":"公告信息管理",
	                    "menuJump":"列表",
	                    "tableName":"news"
	                }
	            ],
	            "menu":"公告信息管理"
	        }
	    ],
	    "frontMenu":[
	
	    ],
	    "roleName":"用户",
	    "tableName":"yonghu"
	}
];

var hasMessage = '';
