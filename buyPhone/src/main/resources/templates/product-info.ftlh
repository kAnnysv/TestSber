<!DOCTYPE html>
<html>
<head>
    <title>BuyPhone</title>
</head>
<body>
<h1>BuyPhone</h1>
<h4>INFO DETAILED</h4><hr>
Company: <input type="text" name="company"/><br><br>
Model:  <input type="text" name="model"/><br><br>
Price:  <input type="number" name="price"/><br><br>

<hr>

<form action="/product/delete/${product.id}" method="post">

    <input type="submit" value="Delete product"/>

</form>
</body>
</html>