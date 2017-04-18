<html>
<head>
<style>
body {
    background: url("images/bdaywallll.jpg");
    background-size: 100% 100%;
    background-repeat: no-repeat;
}
input::-webkit-input-placeholder {
color: white !important;
font-weight : 500;
}
input{
color : white;
outline : none;
font-size:13px;
}
</style>
</head>
<body>
	<%@include file="Header.jsp" %>
	
<div align = "center">
 <form action="/handler" method="post">
	<i>Name :  </i><input type = "text" style = "background: transparent; border-left: transparent;border-top: transparent;border-right: transparent;" placeholder="enter your name" name="umail" required></input><br>
	<input type = "text" style = "background: transparent; border-left: transparent;border-top: transparent;border-right: transparent; width: 200px;height: 50px;" required placeholder="Greet message" name ="greetMsg" required></input>
	<br><input type="submit" style = "background: transparent;" value="Greet Mail" name="submit">
	</form>
	</div>
	<div align="center" style="padding-right: 380px;"> <img src="/Slider/data1/images/2_1.jpg" style="position:absolute;height: 300px;
    width: 350px;"></div>
<div ><iframe width="350" height="300" src="https://www.youtube.com/embed/Kx1-03srzlU" frameborder="0" allowfullscreen></iframe>
<iframe align="right" width="350" height="300" src="https://www.youtube.com/embed/lR6O_leFUyg" frameborder="0" allowfullscreen></iframe>
</div>
	




<%@include file="Footer.jsp"%>
</body>

</html>