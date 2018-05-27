var TelNumPattern=/^[1][3,4,5,7,8][0-9]{9}$/,
	EmailPattern=/^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$/;
	//js正则第一步验证

$(".LoginBtn").click(function(){
    var mydata=new Object;
    mydata.id=$("#ID").val();
    mydata.password=$("#password").val();
    $.ajax({
        type:"POST",
        url:"http://localhost:8080/MVC/Login/Validate",
        contentType:"application/json",
        data:JSON.stringify(mydata),
        success:function(data,status,xhr){
            alert(data);
        },
        error:function(){
            alert("出错了");

        }

    });
	// if((TelNumPattern.test( $("#ID").val())||EmailPattern.test( $("#ID").val()))&&ValidateFormData($("#ID").val(),$("#password").val())){
	// 	alert("登陆成功");
	// }else if(!TelNumPattern.test( $("#ID").val())&&!EmailPattern.test( $("#ID").val())){
     //   $(".id-block").text("账号为手机号或者邮箱");
     //   $(".id-block").css("color","red");
	// }else if(!ValidateFormData($("#ID").val(),$("#password").val())){
     //   $(".password-block").text("密码错误或者账号不存在");
     //   $(".password-block").css("color","red");
	// }
})

$(".RegisterBtn").click(function(){
	// if((TelNumPattern.test( $("#RegisterID").val())||EmailPattern.test( $("#RegisterID").val()))){
	// 	$(".registerId-block").text("账号格式正确");
     //   $(".registerId-block").css("color","green");
	// 	if(!($("#RegisterDublepassword").val()==$("#Registerpassword").val())){
	// 		$(".registerDublepassword-block").text("输入的两次密码不一样");
     //        $(".registerDublepassword-block").css("color","red");
	// 	}else{
	// 		$(".registerDublepassword-block").text("输入的两次密码一样");
     //        $(".registerDublepassword-block").css("color","green");
	// 		PostFormData($("#RegisterID").val(),$("#RegisterDublepassword").val());
	// 	}
	// }else{
	// 	$(".registerId-block").text("账号为手机号或者邮箱");
     //   $(".registerId-block").css("color","red");
	// }
	//
	//
})
