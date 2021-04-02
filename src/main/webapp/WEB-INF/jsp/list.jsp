<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<link rel="stylesheet" href="/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css">
<style>
    .divHover:hover{cursor: pointer;}
</style>

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>영화순위리스트</title>
</head>
<body>
<div class="container mt-5 row text-center">
    <div class="col-6 offset-3 text-center">
        <c:set var="i" value="0" />
        <c:forEach items="${response.data.movies}" var="movie">

            <form id="listForm${i}">
                <input type="hidden" name="summary" value="${movie.summary}">
                <input type="hidden" name="largeCoverImage" value="${movie.large_cover_image}">
            </form>

            <div id="listDiv${i}" class="row mt-1 divHover" style="border: 1px solid grey;" onclick="goView(${i})">
                <div class="col-2">
                    <img width="100%" src="${movie.small_cover_image}" />
                </div>
                <div class="col-5" style="margin-top: 20px;">
                    <div class="row">${movie.title}</div>
                    <div class="row">${movie.year}&nbsp;<c:forEach items="${movie.genres}" var="genre">${genre}&nbsp;</c:forEach></div>
                </div>
            </div>
        <c:set var="i" value="${i + 1}" />
        </c:forEach>
    </div>
</div>

</body>
</html>

<script src="https://code.jquery.com/jquery-3.5.1.min.js"> </script>
<script src="/js/bootstrap.bundle.min.js"></script>
<script src="/js/list.js"></script>
