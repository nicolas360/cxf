package com.zhuc.cxf.t1.restful;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * @Produces 标注返回的MIME媒体类型
 * @Consumes 标注可接受请求的MIME媒体类型
 * Created by ZHUC on 2015/7/14.
 */
@Path("/")
public interface RestHelloWorld {

    /**
     * 包含@Produces的时候 返回类不能是String
     * @param name
     * @return
     */
    @GET
    @Produces ({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    @Path("/say/{name}")
    public String say(@PathParam("name")String name);

    /**
     * 客户端请求
     * http://localhost:8080/cxf/services/restful/getUser/ss
     * http://localhost:8080/cxf/services/restful/getUser/ss?_type=xml 默认为xml返回,与上条等价
     * http://localhost:8080/cxf/services/restful/getUser/ss?_type=json
     *
     * @param id
     * @return
     */
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Path("/getUser/{id}")
    public List<User> getUser(@PathParam("id")String id);

    /**
     * 客户端请求
     * http://localhost:8080/cxf/services/restful/login?name=1111&ps=222
     *
     * @param name
     * @param ps
     * @return
     */
    @GET
    @Produces (MediaType.TEXT_PLAIN)  // 可省略该行
    @Path("/login")
    public String login(@QueryParam("name")String name,@QueryParam("PS")String ps);

    /**
     * 既包含@PathParam，也包含@QueryParam
     * @param id
     * @param name
     * @return
     */
    @GET
    @Path("/login2/{id}")
    @Produces({MediaType.APPLICATION_JSON}) // 只返回json格式
//    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML}) //默认返回xml, 参数添加_type=json/xml, 来分别返回不同格式
    public Result login2(@PathParam("id")String id, @QueryParam("name")String name);


    @POST
    @Path("/login3/{id}")
    @Produces({MediaType.APPLICATION_JSON}) // 只返回json格式
//    @Consumes({MediaType.APPLICATION_FORM_URLENCODED})
    public Result login3(@PathParam("id")String id, @FormParam("name")String name);

    @POST
    @Path("/login4/{id}")
    @Produces({MediaType.APPLICATION_JSON}) // 只返回json格式
//    @Consumes({MediaType.APPLICATION_FORM_URLENCODED}) //可省略
    public Result login4(@PathParam("id")String id, @BeanParam User2 user);

}
