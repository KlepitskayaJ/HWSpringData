<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Landing Page</title>
</head>
<body>
<div class="container">
    <h1>This is the landing page</h1>
    <a th:href="@{user/list}">List of users</a>
</div>
</body>
</html>