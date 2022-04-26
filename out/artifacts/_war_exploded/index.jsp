<%--
  Created by IntelliJ IDEA.
  User: null
  Date: 2022/4/23
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>上传页面</title>
</head>
<body>
<!--上传图片-->
<div>
    <input type="file" name="file" id="file" accept=".jpg,.png,.bmp" class="upload_button" required>
</div>
<h4></h4>
<!--<h4>或者将图片拖拽到这里</h4>-->
<div id="drop-zone" class="form-inline-inline">
    <img src="#" class="upload-drop-zone" id="img"/>
</div>
</body>
</html>
<script src="js/jquery-2.1.0.min.js"></script>
<script>
    /*    //上传文件到后端
        $(function () {
            $("#file").change(function () {
                var formData = new FormData();
                formData.append("file", $("#file")[0].files[0]);
                $.ajax({
                    url: "<%=request.getContextPath()%>/UpFile",
                type: "POST",
                data: formData,
                dataType: "json",
                contentType: false,
                processData: false,
                success: function (data) {
                    if (data.code == 200) {
                        $("#img").attr("src", data.data);
                    } else {
                        alert(data.msg);
                    }
                }
            });
        });
    });*/
    document.querySelector("#file").onchange = function () {
        let reader = new FileReader();
        let file = this.files[0];
        //读取完成
        reader.onload = function (e) {
            //获取图片dom
            let img = document.querySelector("#img");// img 是图片标签id值
            //图片路径设置为读取的图片
            img.src = e.target.result;

            var strData = new FormData();
            strData.append("upfile", file);
            strData.append("type", "feature");
            $.ajax({
                type: "post",
                <%--url:"<%=request.getContextPath()%>/upload",--%>
                url: "<%=request.getContextPath()%>/UpFile",
                data: strData,
                processData: false,
                contentType: false,
                async: false,
                success: function (data) {
                    console.log(data);
                    alert("上传成功")
                }
            })
        };
        reader.readAsDataURL(file);
    }

</script>