<!DOCTYPE html>
<html>
<head>
    <title>BuyPhone</title>
</head>
<body>
<h1>BuyPhone</h1>
<h4>Мoдели в наличии</h4><hr>
<#list products as product>
    <div>
        <p>${product.id} <b>${product.company}</b>  ${product.model} ${product.price} | <a href="/product/${product.id}">INFO...</a></p>
    </div>
</#list>
<hr>
<h3>Add new product</h3>
<form action="/product/create" method="post">
    Company: <input type="text" name="company"/><br><br>
    Model:  <input type="text" name="model"/><br><br>
    Price:  <input type="number" name="price"/><br><br>
    <input type="submit" value="Add product"/>

</form>
</body>
</html>