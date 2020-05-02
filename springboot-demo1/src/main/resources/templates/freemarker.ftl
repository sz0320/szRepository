<!DOCTYPE html>
<html>
	<head lang="en">
		<meta charset="utf-8" />
		<title>首页</title>
	</head>
	<body>
		${name}
		<#if sex="1">
			男
		<#elseif sex="2">
			女
		</#if>
		<#list list as obj>
			${obj}
		</#list>
	</body>
</html>