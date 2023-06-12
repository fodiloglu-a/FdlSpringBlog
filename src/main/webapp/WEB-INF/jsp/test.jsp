<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Hoşgeldiniz</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>

<nav class="navbar navbar-default">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">Blog Sitesi</a>
        </div>
        <ul class="nav navbar-nav">
            <li class="active"><a href="#">Ana Sayfa</a></li>
            <li><a href="#">Blog</a></li>
            <li><a href="#">Hakkımızda</a></li>
            <li><a href="#">İletişim</a></li>
        </ul>
        <form class="navbar-form navbar-right" action="/login" method="post">
            <div class="form-group">
                <input type="text" class="form-control" placeholder="Kullanıcı Adı" name="username">
            </div>
            <div class="form-group">
                <input type="password" class="form-control" placeholder="Şifre" name="password">
            </div>
            <button type="submit" class="btn btn-default">Giriş</button>
        </form>
    </div>
</nav>

<div class="container">
    <h1>Son Blog Gönderileri</h1>
    <ul>
        <li><a href="#">Blog Gönderisi 1</a></li>
        <li><a href="#">Blog Gönderisi 2</a></li>
        <li><a href="#">Blog Gönderisi 3</a></li>
        <li><a href="#">Blog Gönderisi 4</a></li>
        <li><a href="#">Blog Gönderisi 5</a></li>
    </ul>
</div>

</body>
</html>
