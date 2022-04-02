<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Calculator</title>
</head>
<body>
<p>
    Rezultat: ${result}
</p>


<form action="/sumtest2" method="get">
    <label>A:</label>
    <input name="a">
    <br/>
    <label>B:</label>
    <input name="b">
    <br/>

    <input type="submit" value="Submit">
</form>

<p>
    All testList items: </br>
    <#list testList as i>
    ${i} <br/>
    </#list>
</p>
</body>
</html>