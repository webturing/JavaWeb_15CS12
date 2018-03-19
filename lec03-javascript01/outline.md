# javaScript
JavaScript 被数百万计的网页用来改进设计、验证表单、检测浏览器、创建cookies，以及更多的应用。

## 数据类型
- 字符串String
- 数字类型 Number 
- 布尔 Boolean
- 数组类型 Array 
- 对象 Object
- undefined
- NULL

## 算术运算
- 算术加或者字符串链接 +
```
var a=1+3;//a=4
var b="hello"+"world";//b="helloworld"
var c=1+"2";//c="12"```
- 算术减法 - 
- 算术乘法 * 
- 算术除法/，特别注意不取整

```
var x=7/3;//x=3.5 
var y=Math.floor(7/3);//y=2 如果取整则需要使用函数 
```

##自增（减): 
- 自增 ++ 
- 自减 --

## 赋值(复合赋值) 
- 赋值运算:=
- 复合赋值 += -= *= /=
```
var a = 5;
a +=2;//a = 7;
```

##逻辑运算
- 常规  > >= < <=
- 判等(不等)：== 和 - !=  
- 判等(不等)： === !==
```
var ret = "7" == 7;// ret = true; == ！= 判断过程中会发生类型转换
var ret = "7" === 7 ;// ret = false; === !== 判断过程中不会发生类型转换
```

## 数组（每个元素的类型可以不同）
- 索引访问 例如 ```var arr = [1,2,3]; arr[i];```
- 本质是hash表(键可以散列即可如数字，字符串)

### 数组中四个常用的函数
- Array.protype.push()从数组末尾加入一个元素进数组
- Array.protype..pop()从数组末尾删除一个元素出数组
- Array.protype.shift()从数组首位删除一个元素出数组
- Array.protype.unshift()从数组首位加入一个元素进数组
```
var arr = [1,2,3];
arr = arr.push(4); //arr = [1,2,3,4];
var arr = [1,2,3];
var v = arr.pop(); arr = [1,2]; v = 3;
```

### 练习
- [Word Blanks](https://www.freecodecamp.cn/challenges/word-blanks)
- [Stand in Line](https://www.freecodecamp.cn/challenges/stand-in-line) 