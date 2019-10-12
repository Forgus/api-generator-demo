## 示例
```json
{
  "price": 0,
  "id": 0,
  "categories": [
    "String"
  ],
  "author": "String",
  "name": "String"
}
```
## 参数说明
名称|类型|必填|值域范围|描述/示例
--|--|--|--|--
id|Long|Y|[1,]|编号
name|String|Y|[1,20]|书名
price|Long|Y|[0,99]|定价
author|String|Y|[0,10]|作者
categories|String[]|Y|[0,10]|所属分类
