<!DOCTYPE html>
<html>
<head>
    <title>BuyPhone</title>
</head>
<body>
<h1>BuyPhone</h1>
<h4>INFO DETAILED</h4>
<hr>
<b>Company: </b>${product.company}<br>
<b>Model: </b>${product.model}<br>
<b>Price: </b>${product.price}<br>

<hr>
<h4> DElETE</h4>

<form action="/product/delete/${product.id}" method="post">

    <input type="submit" value="Delete product"/>

</form>
<hr>
<h4> UPDATE</h4>

<form action="/product/update/${product.id}" method="post">
    Company: <input type="text" name="company"/><br><br>
    Model: <input type="text" name="model"/><br><br>
    Price: <input type="number" name="price"/><br><br>
    <input type="submit" value="Update product"/>
</form>

</body>
</html>