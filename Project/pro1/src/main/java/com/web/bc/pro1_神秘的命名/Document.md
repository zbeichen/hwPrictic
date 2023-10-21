方法：amont -- 猜测拼写错误 -- 可能为amount   改进 calculateAmount
传参：Perf --猜测是缩写，不明确A   改为 Performance     
Type -- 猜测是根据类型走不同的分支，但具体含义不详   改进：虽然能识别，但为了更一目了然，playType
type1,type2: 改为 TRAGEDY 悲剧 COMEDY 戏剧
resfortype1、resfortype2 ：看出是不同类型执行的分支，但具体含义不详 calculateTragedyAmount 计算悲剧金额  calculateComedyAmount
s:返回值，含义不详  totalAmount 总金额
getAud: 猜测是业务缩写词语 并不是所以缩写都好，AudienceNum 观众数量

方法命名规范：动名词+名词
变量名：名词
避免拼写错误
变量、方法、枚举等，都要使用有具体含义的命名方式
避免随意的缩写

ctrl+shift+f10 执行当前光标所在位置的类/方法
shift+f6 修改方法名