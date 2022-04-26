package DB;
/*
@ClassName:     UpFile
@Author:        YangXu
@Need:
@Date:          2022/4/23
@Time:          2022-04-23 15:42
*/

//

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/UpFile")
public class UpFile extends HttpServlet {

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    System.out.println("接收到了post请求");
    // 获取前端上传的图片
    req.setCharacterEncoding("utf-8");
    resp.setContentType("text/html;charset=utf-8");
    resp.setCharacterEncoding("utf-8");
    // 保存文件的路径
    String path = req.getServletContext().getRealPath("./upload");
    // 获取文件名
    String filename = req.getParameter("filename");
    // 将文件名加密
    // 获取文件

    File file = new File(path, filename);
    if (!file.exists()) {
      file.mkdirs();
    }

    Part part = req.getPart("upfile");
    String fileName = part.getSubmittedFileName();

    File f = new File(path, File.separator + fileName);
    if (f.exists()) {
      f.delete();
    }

    // 获取文件的输入流
    part.write(path + File.separator + filename);

    PrintWriter out = resp.getWriter();
    out.println("<script>alert('上传成功');</script>");
    out.println("保存成功");
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    System.out.println("接收到了get请求");
  }
}
/*

*/
