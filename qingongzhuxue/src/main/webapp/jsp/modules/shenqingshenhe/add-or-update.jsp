<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="zh-cn">

<head>
    <%@ include file="../../static/head.jsp" %>
    <link href="http://www.bootcss.com/p/bootstrap-datetimepicker/bootstrap-datetimepicker/css/datetimepicker.css"
          rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap-select.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <script type="text/javascript" charset="utf-8">
        window.UEDITOR_HOME_URL = "${pageContext.request.contextPath}/resources/ueditor/"; //UEDITOR_HOME_URL、config、all这三个顺序不能改变
    </script>
    <script type="text/javascript" charset="utf-8"
            src="${pageContext.request.contextPath}/resources/ueditor/ueditor.config.js"></script>
    <script type="text/javascript" charset="utf-8"
            src="${pageContext.request.contextPath}/resources/ueditor/ueditor.all.min.js"></script>
    <script type="text/javascript" charset="utf-8"
            src="${pageContext.request.contextPath}/resources/ueditor/lang/zh-cn/zh-cn.js"></script>
</head>
<style>
    .error {
        color: red;
    }
</style>
<body>
<!-- Pre Loader -->
<div class="loading">
    <div class="spinner">
        <div class="double-bounce1"></div>
        <div class="double-bounce2"></div>
    </div>
</div>
<!--/Pre Loader -->
<div class="wrapper">
    <!-- Page Content -->
    <div id="content">
        <!-- Top Navigation -->
        <%@ include file="../../static/topNav.jsp" %>
        <!-- Menu -->
        <div class="container menu-nav">
            <nav class="navbar navbar-expand-lg lochana-bg text-white">
                <button class="navbar-toggler" type="button" data-toggle="collapse"
                        data-target="#navbarSupportedContent"
                        aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="ti-menu text-white"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul id="navUl" class="navbar-nav mr-auto">

                    </ul>
                </div>
            </nav>
        </div>
        <!-- /Menu -->
        <!-- Breadcrumb -->
        <!-- Page Title -->
        <div class="container mt-0">
            <div class="row breadcrumb-bar">
                <div class="col-md-6">
                    <h3 class="block-title">编辑申请审核</h3>
                </div>
                <div class="col-md-6">
                    <ol class="breadcrumb">
                        <li class="breadcrumb-item">
                            <a href="${pageContext.request.contextPath}/index.jsp">
                                <span class="ti-home"></span>
                            </a>
                        </li>
                        <li class="breadcrumb-item">申请审核管理</li>
                        <li class="breadcrumb-item active">编辑申请审核</li>
                    </ol>
                </div>
            </div>
        </div>
        <!-- /Page Title -->

        <!-- /Breadcrumb -->
        <!-- Main Content -->
        <div class="container">

            <div class="row">
                <!-- Widget Item -->
                <div class="col-md-12">
                    <div class="widget-area-2 lochana-box-shadow">
                        <h3 class="widget-title">申请审核信息</h3>
                        <form id="addOrUpdateForm">
                            <div class="form-row">
                            <!-- 级联表的字段 -->
                                    <div class="form-group col-md-6 aaaaaa gangwei">
                                        <label>岗位信息</label>
                                        <div>
                                            <select id="gangweiSelect" name="gangweiSelect"
                                                    class="selectpicker form-control"  data-live-search="true"
                                                    title="请选择" data-header="请选择" data-size="5" data-width="650px">
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group col-md-6 gangwei">
                                        <label>岗位名称</label>
                                        <input id="gangweiName" name="gangweiName" class="form-control"
                                               placeholder="岗位名称" readonly>
                                    </div>
                                    <div class="form-group col-md-6 gangwei">
                                        <label>岗位类型</label>
                                        <input id="gangweiValue" name="gangweiValue" class="form-control"
                                               placeholder="岗位类型" readonly>
                                    </div>
                                    <div class="form-group col-md-6 gangwei">
                                        <label>岗位薪资</label>
                                        <input id="gangweiMoney" name="gangweiMoney" class="form-control"
                                               placeholder="岗位薪资" readonly>
                                    </div>
                                    <div class="form-group col-md-6 gangwei">
                                        <label>岗位要求</label>
                                        <input id="gangweiYaoqiu" name="gangweiYaoqiu" class="form-control"
                                               placeholder="岗位要求" readonly>
                                    </div>
                                    <div class="form-group col-md-6 gangwei">
                                        <label>工作时间/时</label>
                                        <input id="gangweiShijian" name="gangweiShijian" class="form-control"
                                               placeholder="工作时间/时" readonly>
                                    </div>
                                    <div class="form-group col-md-6 aaaaaa yonghu">
                                        <label>用户</label>
                                        <div>
                                            <select id="yonghuSelect" name="yonghuSelect"
                                                    class="selectpicker form-control"  data-live-search="true"
                                                    title="请选择" data-header="请选择" data-size="5" data-width="650px">
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group col-md-6 yonghu">
                                        <label>用户姓名</label>
                                        <input id="yonghuName" name="yonghuName" class="form-control"
                                               placeholder="用户姓名" readonly>
                                    </div>
                                    <div class="form-group col-md-6 yonghu">
                                        <label>身份证号</label>
                                        <input id="yonghuIdNumber" name="yonghuIdNumber" class="form-control"
                                               placeholder="身份证号" readonly>
                                    </div>
                                    <div class="form-group col-md-6 yonghu">
                                        <label>手机号</label>
                                        <input id="yonghuPhone" name="yonghuPhone" class="form-control"
                                               placeholder="手机号" readonly>
                                    </div>
                                    <div class="form-group col-md-6 yonghu">
                                        <label>邮箱</label>
                                        <input id="yonghuEmail" name="yonghuEmail" class="form-control"
                                               placeholder="邮箱" readonly>
                                    </div>
                                    <div class="form-group col-md-6 yonghu">
                                        <label>照片</label>
                                        <img id="yonghuPhotoImg" src="" width="100" height="100">
                                    </div>
                                    <div class="form-group col-md-6 yonghu">
                                        <label>岗位信息</label>
                                        <input id="gangwei" name="gangwei" class="form-control"
                                               placeholder="岗位信息" readonly>
                                    </div>
                            <!-- 当前表的字段 -->
                                    <input id="updateId" name="id" type="hidden">
                                <input id="yonghuId" name="yonghuId" type="hidden">
                                <input id="gangweiId" name="gangweiId" type="hidden">
                                    <div class="form-group col-md-6">
                                        <label>申请类型</label>
                                        <select style="pointer-events: none;" id="kaohepingjiaTypesSelect" name="kaohepingjiaTypes" class="form-control">
                                        </select>
                                    </div>
                                    <div class="form-group col-md-6">
                                        <label>申请文件</label>
                                        <input name="file" type="file" class="form-control-file" id="shenqingshenheFileupload">
                                        <label id="shenqingshenheFileName"></label>
                                        <input name="shenqingshenheFile" id="shenqingshenheFile-input" type="hidden">
                                    </div>
                                    <div class="form-group col-md-6" style="display:none">
                                        <label>审核状态</label>
                                        <input value="1" id="shenqingshenheTypesSelect" name="shenqingshenheTypes" class="form-control">
                                    </div>
                                    <div class="form-group col-md-12 mb-3">
                                        <button id="submitBtn" type="button" class="btn btn-primary btn-lg">提交</button>
                                        <button id="exitBtn" type="button" class="btn btn-primary btn-lg">返回</button>
                                    </div>
                            </div>
                        </form>
                    </div>
                </div>
                <!-- /Widget Item -->
            </div>
        </div>
        <!-- /Main Content -->
    </div>
    <!-- /Page Content -->
</div>
<!-- Back to Top -->
<a id="back-to-top" href="#" class="back-to-top">
    <span class="ti-angle-up"></span>
</a>
<!-- /Back to Top -->
<%@ include file="../../static/foot.jsp" %>
<script src="${pageContext.request.contextPath}/resources/js/vue.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/jquery.ui.widget.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/jquery.fileupload.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/jquery.form.js"></script>
<script type="text/javascript" charset="utf-8"
        src="${pageContext.request.contextPath}/resources/js/validate/jquery.validate.min.js"></script>
<script type="text/javascript" charset="utf-8"
        src="${pageContext.request.contextPath}/resources/js/validate/messages_zh.js"></script>
<script type="text/javascript" charset="utf-8"
        src="${pageContext.request.contextPath}/resources/js/validate/card.js"></script>
<script type="text/javascript" charset="utf-8"
        src="${pageContext.request.contextPath}/resources/js/datetimepicker/bootstrap-datetimepicker.min.js"></script>
<script type="text/javascript" charset="utf-8"
                 src="${pageContext.request.contextPath}/resources/js/bootstrap-select.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/laydate.js"></script>
<script>
    <%@ include file="../../utils/menu.jsp"%>
    <%@ include file="../../static/setMenu.js"%>
    <%@ include file="../../utils/baseUrl.jsp"%>

    var tableName = "shenqingshenhe";
    var pageType = "add-or-update";
    var updateId = "";
    var crossTableId = -1;
    var crossTableName = '';
    var ruleForm = {};
    var crossRuleForm = {};


    // 下拉框数组
        <!-- 当前表的下拉框数组 -->
    var kaohepingjiaTypesOptions = [];
    var shenqingshenheTypesOptions = [];
        <!-- 级联表的下拉框数组 -->
    var gangweiOptions = [];
    var yonghuOptions = [];

    var ruleForm = {};


    // 文件上传
    function upload() {

        <!-- 当前表的文件上传 -->

        $('#shenqingshenheFileupload').fileupload({
            url: baseUrl + 'file/upload',
            headers: {token: window.sessionStorage.getItem("token")},
            dataType: 'json',
            done: function (e, data) {
                document.getElementById('shenqingshenheFile-input').setAttribute('value', baseUrl + 'file/download?fileName=' + data.result.file);
                document.getElementById('shenqingshenheFileName').innerHTML = "上传成功!";
            }
        });


    }

    // 表单提交
    function submit() {
        if (validform() == true && compare() == true) {
            let data = {};
            getContent();
            if(window.sessionStorage.getItem('role') != '用户'){//当前登录用户不为这个
                if($("#shenqingshenheFile-input") !=null){
                    var shenqingshenheFile = $("#shenqingshenheFile-input").val();
                    if(shenqingshenheFile == null || shenqingshenheFile =='' || shenqingshenheFile == 'null'){
                        alert("申请文件不能为空");
                        return;
                    }
                }
            }
            let value = $('#addOrUpdateForm').serializeArray();
            $.each(value, function (index, item) {
                data[item.name] = item.value;
            });
            let json = JSON.stringify(data);
            var urlParam;
            var successMes = '';
            if (updateId != null && updateId != "null" && updateId != '') {
                urlParam = 'update';
                successMes = '修改成功';
            } else {
                urlParam = 'save';
                    successMes = '添加成功';

            }
            httpJson("shenqingshenhe/" + urlParam, "POST", data, (res) => {
                if(res.code == 0){
                    window.sessionStorage.removeItem('addshenqingshenhe');
                    window.sessionStorage.removeItem('updateId');
                    let flag = true;
                    if (flag) {
                        alert(successMes);
                    }
                    if (window.sessionStorage.getItem('onlyme') != null && window.sessionStorage.getItem('onlyme') == "true") {
                        window.sessionStorage.removeItem('onlyme');
                        window.sessionStorage.setItem("reload","reload");
                        window.parent.location.href = "${pageContext.request.contextPath}/index.jsp";
                    } else {
                        window.location.href = "list.jsp";
                    }
                }
            });
        } else {
            alert("表单未填完整或有错误");
        }
    }

    // 查询列表
        <!-- 查询当前表的所有列表 -->
        function kaohepingjiaTypesSelect() {
            //填充下拉框选项
            http("dictionary/page?page=1&limit=100&sort=&order=&dicCode=kaohepingjia_types", "GET", {}, (res) => {
                if(res.code == 0){
                    kaohepingjiaTypesOptions = res.data.list;
                }
            });
        }
        function shenqingshenheTypesSelect() {
            //填充下拉框选项
            http("dictionary/page?page=1&limit=100&sort=&order=&dicCode=shenqingshenhe_types", "GET", {}, (res) => {
                if(res.code == 0){
                    shenqingshenheTypesOptions = res.data.list;
                }
            });
        }
        <!-- 查询级联表的所有列表 -->
        function gangweiSelect() {
            //填充下拉框选项
            http("gangwei/page?page=1&limit=100&sort=&order=", "GET", {}, (res) => {
                if(res.code == 0){
                    gangweiOptions = res.data.list;
                }
            });
        }

        function gangweiSelectOne(id) {
            http("gangwei/info/"+id, "GET", {}, (res) => {
                if(res.code == 0){
                ruleForm = res.data;
                gangweiShowImg();
                gangweiShowVideo();
                gangweiDataBind();
            }
        });
        }
        function yonghuSelect() {
            //填充下拉框选项
            http("yonghu/page?page=1&limit=100&sort=&order=", "GET", {}, (res) => {
                if(res.code == 0){
                    yonghuOptions = res.data.list;
                }
            });
        }

        function yonghuSelectOne(id) {
            http("yonghu/info/"+id, "GET", {}, (res) => {
                if(res.code == 0){
                ruleForm = res.data;
                yonghuShowImg();
                yonghuShowVideo();
                yonghuDataBind();
            }
        });
        }



    // 初始化下拉框
    <!-- 初始化当前表的下拉框 -->
        function initializationKaohepingjiatypesSelect(){
            var kaohepingjiaTypesSelect = document.getElementById('kaohepingjiaTypesSelect');
            if(kaohepingjiaTypesSelect != null && kaohepingjiaTypesOptions != null  && kaohepingjiaTypesOptions.length > 0 ){
                for (var i = 0; i < kaohepingjiaTypesOptions.length; i++) {
                    kaohepingjiaTypesSelect.add(new Option(kaohepingjiaTypesOptions[i].indexName,kaohepingjiaTypesOptions[i].codeIndex));
                }
            }
        }
        function initializationShenqingshenhetypesSelect(){
        }

        function initializationgangweiSelect() {
            var gangweiSelect = document.getElementById('gangweiSelect');
            if(gangweiSelect != null && gangweiOptions != null  && gangweiOptions.length > 0 ) {
                for (var i = 0; i < gangweiOptions.length; i++) {
                        gangweiSelect.add(new Option(gangweiOptions[i].gangweiName, gangweiOptions[i].id));
                }

                $("#gangweiSelect").change(function(e) {
                        gangweiSelectOne(e.target.value);
                });
            }

        }

        function initializationyonghuSelect() {
            var yonghuSelect = document.getElementById('yonghuSelect');
            if(yonghuSelect != null && yonghuOptions != null  && yonghuOptions.length > 0 ) {
                for (var i = 0; i < yonghuOptions.length; i++) {
                        yonghuSelect.add(new Option(yonghuOptions[i].yonghuName, yonghuOptions[i].id));
                }

                $("#yonghuSelect").change(function(e) {
                        yonghuSelectOne(e.target.value);
                });
            }

        }



    // 下拉框选项回显
    function setSelectOption() {

        <!-- 当前表的下拉框回显 -->

        <!--  级联表的下拉框回显  -->
            var gangweiSelect = document.getElementById("gangweiSelect");
            if(gangweiSelect != null && gangweiOptions != null  && gangweiOptions.length > 0 ) {
                for (var i = 0; i < gangweiOptions.length; i++) {
                    if (gangweiOptions[i].id == ruleForm.gangweiId) {//下拉框value对比,如果一致就赋值汉字
                        gangweiSelect.options[i+1].selected = true;
                        $("#gangweiSelect" ).selectpicker('refresh');
                    }
                }
            }
            var yonghuSelect = document.getElementById("yonghuSelect");
            if(yonghuSelect != null && yonghuOptions != null  && yonghuOptions.length > 0 ) {
                for (var i = 0; i < yonghuOptions.length; i++) {
                    if (yonghuOptions[i].id == ruleForm.yonghuId) {//下拉框value对比,如果一致就赋值汉字
                        yonghuSelect.options[i+1].selected = true;
                        $("#yonghuSelect" ).selectpicker('refresh');
                    }
                }
            }
    }


    // 填充富文本框
    function setContent() {

        <!-- 当前表的填充富文本框 -->
    }
    // 获取富文本框内容
    function getContent() {

        <!-- 获取当前表的富文本框内容 -->
    }
    //数字检查
        <!-- 当前表的数字检查 -->

    function exit() {
        window.sessionStorage.removeItem("updateId");
        window.sessionStorage.removeItem('addshenqingshenhe');
        window.location.href = "list.jsp";
    }
    // 表单校验
    function validform() {
        return $("#addOrUpdateForm").validate({
            rules: {
                yonghuId: "required",
                gangweiId: "required",
                kaohepingjiaTypes: "required",
                shenqingshenheFile: "required",
                shenqingshenheTypes: "required",
                insertTime: "required",
            },
            messages: {
                yonghuId: "申请用户不能为空",
                gangweiId: "申请岗位不能为空",
                kaohepingjiaTypes: "申请类型不能为空",
                shenqingshenheFile: "申请文件不能为空",
                shenqingshenheTypes: "审核状态不能为空",
                insertTime: "申请时间不能为空",
            }
        }).form();
    }

    // 获取当前详情
    function getDetails() {
        var addshenqingshenhe = window.sessionStorage.getItem("addshenqingshenhe");
        if (addshenqingshenhe != null && addshenqingshenhe != "" && addshenqingshenhe != "null") {
            //注册表单验证
            $(validform());
            $('#submitBtn').text('新增');

        } else {
            $('#submitBtn').text('修改');
            var userId = window.sessionStorage.getItem('userId');
            updateId = userId;//先赋值登录用户id
            var uId  = window.sessionStorage.getItem('updateId');//获取修改传过来的id
            if (uId != null && uId != "" && uId != "null") {
                //如果修改id不为空就赋值修改id
                updateId = uId;
            }
            window.sessionStorage.removeItem('updateId');
            http("shenqingshenhe/info/" + updateId, "GET", {}, (res) => {
                if(res.code == 0)
                {
                    ruleForm = res.data
                    // 是/否下拉框回显
                    setSelectOption();
                    // 设置图片src
                    showImg();
                    // 设置视频src
                    showVideo();
                    // 数据填充
                    dataBind();
                    // 富文本框回显
                    setContent();
                    //注册表单验证
                    $(validform());
                }

            });
        }
    }

    // 清除可能会重复渲染的selection
    function clear(className) {
        var elements = document.getElementsByClassName(className);
        for (var i = elements.length - 1; i >= 0; i--) {
            elements[i].parentNode.removeChild(elements[i]);
        }
    }

    function dateTimePick() {
            laydate.render({
                elem: '#insertTime-input'
                ,type: 'datetime'
            });
    }


    function dataBind() {


    <!--  级联表的数据回显  -->
        gangweiDataBind();
        yonghuDataBind();


    <!--  当前表的数据回显  -->
        $("#updateId").val(ruleForm.id);
        $("#yonghuId").val(ruleForm.yonghuId);
        $("#gangweiId").val(ruleForm.gangweiId);
        $("#insertTime-input").val(ruleForm.insertTime);
        $("#shenqingshenheTypesSelect").val(ruleForm.shenqingshenheTypes);

    }
    <!--  级联表的数据回显  -->
    function gangweiDataBind(){

                    <!-- 把id赋值给当前表的id-->
        $("#gangweiId").val(ruleForm.id);

        $("#gangweiName").val(ruleForm.gangweiName);
        $("#gangweiValue").val(ruleForm.gangweiValue);
        $("#gangweiMoney").val(ruleForm.gangweiMoney);
        $("#gangweiYaoqiu").val(ruleForm.gangweiYaoqiu);
        $("#gangweiShijian").val(ruleForm.gangweiShijian);
        $("#gangweiContent").val(ruleForm.gangweiContent);
    }

    function yonghuDataBind(){

                    <!-- 把id赋值给当前表的id-->
        $("#yonghuId").val(ruleForm.id);

        $("#yonghuName").val(ruleForm.yonghuName);
        $("#yonghuIdNumber").val(ruleForm.yonghuIdNumber);
        $("#yonghuPhone").val(ruleForm.yonghuPhone);
        $("#yonghuEmail").val(ruleForm.yonghuEmail);
        if(ruleForm.gangwei == 0){
            $("#gangwei").val("无岗位");
        }else{
            $("#gangwei").val(ruleForm.gangweiName);
        }
    }


    //图片显示
    function showImg() {
        <!--  当前表的图片  -->

        <!--  级联表的图片  -->
        gangweiShowImg();
        yonghuShowImg();
    }


    <!--  级联表的图片  -->

    function gangweiShowImg() {
    }


    function yonghuShowImg() {
        $("#yonghuPhotoImg").attr("src",ruleForm.yonghuPhoto);
    }



    //视频回显
    function showVideo() {
    <!--  当前表的视频  -->

    <!--  级联表的视频  -->
        gangweiShowVideo();
        yonghuShowVideo();
    }


    <!--  级联表的视频  -->

    function gangweiShowVideo() {
    }

    function yonghuShowVideo() {
        $("#yonghuPhotoV").attr("src",ruleForm.yonghuPhoto);
    }



    $(document).ready(function () {
        //设置右上角用户名
        $('.dropdown-menu h5').html(window.sessionStorage.getItem('username'))
        //设置项目名
        $('.sidebar-header h3 a').html(projectName)
        //设置导航栏菜单
        setMenu();
        $('#exitBtn').on('click', function (e) {
            e.preventDefault();
            exit();
        });
        //初始化时间插件
        dateTimePick();
        //查询所有下拉框
            <!--  当前表的下拉框  -->
            kaohepingjiaTypesSelect();
            shenqingshenheTypesSelect();
            <!-- 查询级联表的下拉框(用id做option,用名字及其他参数做名字级联修改) -->
            gangweiSelect();
            yonghuSelect();



        // 初始化下拉框
            <!--  初始化当前表的下拉框  -->
            initializationKaohepingjiatypesSelect();
            initializationShenqingshenhetypesSelect();
            <!--  初始化级联表的下拉框  -->
            initializationgangweiSelect();
            initializationyonghuSelect();

        $(".selectpicker" ).selectpicker('refresh');
        getDetails();
        //初始化上传按钮
        upload();
    <%@ include file="../../static/myInfo.js"%>
                $('#submitBtn').on('click', function (e) {
                    e.preventDefault();
                    //console.log("点击了...提交按钮");
                    submit();
                });
        readonly();
        window.sessionStorage.removeItem('addshenqingshenhe');
    });

    function readonly() {
        if (window.sessionStorage.getItem('role') == '管理员') {
            //$('#jifen').attr('readonly', 'readonly');
            //$('#role').attr('style', 'pointer-events: none;');
        }
		else if (window.sessionStorage.getItem('role') == '用户') {
            $(".yonghu").remove();//删除当前用户的信息
            $(".gangwei").remove();
            var kaohepingjiaTypesSelect = document.getElementById("kaohepingjiaTypesSelect");
            if(kaohepingjiaTypesSelect != null && kaohepingjiaTypesOptions != null  && kaohepingjiaTypesOptions.length > 0 ) {
                for (var i = 0; i < kaohepingjiaTypesOptions.length; i++) {
                    if (kaohepingjiaTypesOptions[i].codeIndex == window.sessionStorage.getItem('leixing')) {//下拉框value对比,如果一致就赋值汉字
                        kaohepingjiaTypesSelect.options[i].selected = true;
                    }
                }
            }
            yonghuSelectOne(window.sessionStorage.getItem('userId'));
            gangweiSelectOne(window.sessionStorage.getItem('ganweiId'));
            window.sessionStorage.removeItem("leixing");

        }
		else if (window.sessionStorage.getItem('role') == '部门管理员') {
            // $(".aaaaaa").remove();
        }
        else{
            // alert("未知情况.......");
            // var replyContentUeditor = UE.getEditor('replyContentEditor');
            // replyContentUeditor.ready(function () {
            //     replyContentUeditor.setDisabled('fullscreen');
            // });
        }
    }

    //比较大小
    function compare() {
        var largerVal = null;
        var smallerVal = null;
        if (largerVal != null && smallerVal != null) {
            if (largerVal <= smallerVal) {
                alert(smallerName + '不能大于等于' + largerName);
                return false;
            }
        }
        return true;
    }


    // 用户登出
    <%@ include file="../../static/logout.jsp"%>
</script>
</body>

</html>