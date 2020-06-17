<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="/webjars/jquery/3.1.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="/webjars/bootstrap/3.3.5/css/bootstrap.min.css" />
<link rel="stylesheet" href="/webjars/bootstrap/4.0.0/css/bootstrap.css" />
<script type="text/javascript">
function save(){
	$.post('../meeting/save',$('#meetingInfoForm').serialize(),function(result){
		if(result.save=="OK"){
			location.href="/meeting/showMeetingList";
		} else {
			alert("请修改预约时间！");
		}
	});
}
</script>

<style type="text/css">
.mainArea{
	margin-left: 50px;
}
</style>
<title>预约会议室</title>
</head>
<body>
	<div style="height: 40px; width: 100%; background: #f8f8f8; border: 1px solid #f0f8ff; font-weight: bold;padding-top: 10px;">
		<span style="padding-left: 10px;">预约会议室</span> 
	</div>
	<div class="mainArea">
		<form method="post" id="meetingInfoForm">
			会议室：<select name="meetingRoom">
			<option>506</option>
			<option>508</option>
			<option>512</option>
			<option>518</option>
			</select><br>
			预定日期*：<input type="date" name="selectDate" required><br>
			开始时间*：<select name="strTime">
			<option>09:00</option>
			<option>09:30</option>
			<option>10:00</option>
			<option>10:30</option>
			<option>11:00</option>
			<option>11:30</option>
			<option>12:00</option>
			<option>12:30</option>
			<option>13:00</option>
			<option>13:30</option>
			<option>14:00</option>
			<option>14:30</option>
			<option>15:00</option>
			<option>15:30</option>
			<option>16:00</option>
			<option>16:30</option>
			<option>17:00</option>
			<option>17:30</option>
			<option>18:00</option>
			<option>18:30</option>
			<option>19:00</option>
			<option>19:30</option>
			<option>20:00</option>
			<option>20:30</option>
			<option>21:00</option>
			</select><br>
			结束时间*：<select name="endTime">
			<option>09:30</option>
			<option>10:00</option>
			<option>10:30</option>
			<option>11:00</option>
			<option>11:30</option>
			<option>12:00</option>
			<option>12:30</option>
			<option>13:00</option>
			<option>13:30</option>
			<option>14:00</option>
			<option>14:30</option>
			<option>15:00</option>
			<option>15:30</option>
			<option>16:00</option>
			<option>16:30</option>
			<option>17:00</option>
			<option>17:30</option>
			<option>18:00</option>
			<option>18:30</option>
			<option>19:00</option>
			<option>19:30</option>
			<option>20:00</option>
			<option>20:30</option>
			<option>21:00</option>
			<option>21:30</option>
			</select><br>
			预订人*：<input type="text" name="presetUser" id="presetUser" required><br>
			电话*：<input type="tel" name="presetUserTel" id="presetUserTel" required><br>
			邮箱：<input type="text" name="presetUserEmail" id="presetUserEmail"><label> @neusoft.com</label><br>
			预定原因：<select name="reason">
			<option>项目评审</option>
			<option>项目会议</option>
			<option>部门会议</option>
			<option>客户来访</option>
			<option>培训</option>
			<option>面试</option>
			</select><br>
			备注：<textarea rows="3" cols="20" name="comment"></textarea><br>
			<button type="button" onclick="save()">预定</button>
			<button type="button" onclick="cancle()">取消</button>
		</form>
	</div>
</body>
</html>