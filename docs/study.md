## ********************Java相关********************

### Postman使用
- 传递时间参数
	- postman.setGlobalVariable("now",Date.parse(new Date()));

## ********************SprintBoot相关********************

### SpringBoot 项目终端打包命令
- mvn package clean -Dmaven.test.skip=true // 把之前打过的包通通干掉。
- mvn package -Dmaven.test.skip=true	// 重新打包。

### SprintgBoot项目启动时找不到或无法加载主类
- 解决：在 idea 控制台输入 mvn clean install 命令

## ********************数据库相关********************

### sql命令

- sql命令导入sql文件
	- source xxx.sql

- 导出整个数据库
	- mysqldump -u dbuser -p dbname > dbname.sql（保存在当前目录下）

### 数据库相关问题
	
- 数据库连接时报错 Public Key Retrieval is not allowed.
	- 解决方案：url增加 &allowPublicKeyRetrieval=true
	
- Expression #1 of SELECT list is not in GROUP BY clause and contains nonaggre
	- 原因：MySQL 5.7.5及以上功能依赖检测功能。如果启用了ONLY_FULL_GROUP_BY SQL模式（默认情况下），
		MySQL将拒绝选择列表
	- 解决：select @@global.sql_mode，去掉ONLY_FULL_GROUP_BY，重新设置值。
		- set @@global.sql_mode='NO_ENGINE_SUBSTITUTION';	// Mysql 服务重启后可能会变化？？？
		
- MySql的四种Blob类型
	``` 
	tinyblob（225B）
	blob（65K）
	mediunblob（16M）
	longblob（4G）
	```
- Mysql增加触发器示例
	```
	create trigger tri_test_update
	after update on test_update_trigger
	for each row
	begin
	insert into test_log(update_id,log_text) values(NEW.id,concat(cast(NEW.age as char),'修改为：',cast(OLD.age as char)));
	end
	```

## ********************控制版本工具********************

### git 拉取远程仓库
- git stash					// 备份当前的工作区的内容
- git pull/sourceTree点击拉取	// 拉取远程仓库 
- git stash pop				// 恢复工作区的相关内容

### git 提交步骤(VSCode)
- 修改文件
- 新建功能：功能名称 v1.0.1-xxx，基于 develop 新建分支 feature-xxx
- 在 VSCode 中执行 
	- git add .
	- npm run commit，填写描述等
		- Select the type of change that you're committing: feat:     A new feature
		- What is the scope of this change (e.g. component or file name): (press enter to skip) add thumbnail name
		- Write a short, imperative tense description of the change (max 74 chars):
		 (8) dbupdate
		- Provide a longer description of the change: (press enter to skip)
		 dbupdate
		- Are there any breaking changes? No
		- Does this change affect any open issues? No
	- git push
- sourceTree完成功能，合并到develop，删除分支
- 点击推送

### Git Flow

- Production 分支[master]
  也就是我们经常使用的 master 分支，这个分支最近发布到生产环境的代码，最近发布的 Release， 这个分支只能从其他分支合并，不能在这个分支直接修改

- Develop 分支[develop]
  这个分支是我们是我们的主开发分支，包含所有要发布到下一个 Release 的代码，这个主要合并与其他分支，比如 Feature 分支
  tag: dev-版本号-年月日时分

- Feature 分支[feature/[v0.0.1-***]]
  这个分支主要是用来开发一个新的功能，一旦开发完成，我们合并回 Develop 分支进入下一个 Release
  版本号为下一版本版本号
  tag: fea-版本号-年月日时分

- Release 分支[release/[v0.0.1-***]]
  当你需要一个发布一个新 Release 的时候，我们基于 Develop 分支创建一个 Release 分支，完成 Release 后，我们合并到 [Master]和[Develop]分支
  版本号为下一版本版本号
  tag: qa-版本号-[issues]-年月日时分

- Hotfix 分支[hotfix/[v0.0.1-***]]
  当我们在 Production 发现新的 Bug 时候，我们需要创建一个 Hotfix, 完成 Hotfix 后，我们合并回 Master 和 [Develop]分支，所以[Hotfix]的改动会进入下一个[Release]
  版本号为当前修正版本版本号
  tag: fix-版本号-[issues]-年月日时分