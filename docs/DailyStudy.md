## ********************MidWay相关********************

### Sequelize
- 升级数据库调试命令
node --inspect-brk=32000  node_modules\sequelize-cli\lib\sequelize db:migrate
- 调试地址：
chrome://inspect/#devices

### yarn命令使用
- npm i yarn -g
	- -i：install 
	- -g：全局安装（global）,使用 -g 或 --global
- yarn -version  yarn版本号
- 常用命令：
	- yarn / yarn install 等同于npm install 批量安装依赖
	- yarn add xxx 等同于 npm install xxx —save 安装指定包到指定位置
	- yarn remove xxx 等同于 npm uninstall xxx —save 卸载指定包
	- yarn add xxx —dev 等同于 npm install xxx —save-dev
	- yarn upgrade 等同于 npm update 升级全部包
	- yarn global add xxx 等同于 npm install xxx -g 全局安装指定包


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

### SpringBoot项目打成jar包设置开机自启动
- 1、jar包放置在指定位置
- 2、新建文件 xxx.bat 内容为jar包启动命令：java -jar E:\jar\xxx-1.0.0.1.jar（此时双击文件可以启动项目）
- 3、开始 -> 运行 -> 输入 gpedit.msc 确定 -> 计算机配置 -> windows 设置 -> 脚本（启动/关机）
	-> 双击启动 -> 添加，选择xxx.bat 应用。

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
  

## ********************操作系统相关********************
### CentOS 操作相关
- 修改文件的只读/读写属性（到文件目录下执行 ）
	- chmod 666 xxx.txt(将文件属性改为读写)	
	- chmod 644 xxx.txt(将文件属性改为只读)

- 在Centos中创建文件
	- touch xxxxxx【文件名】
- 关闭防火墙
	- 1. 关闭防火墙：sudo systemctl stop firewalld.service
　　- 2. 关闭开机启动：sudo systemctl disable firewalld.service

## Docker相关

### Docker基本概念
- Client（客户端）： 	
	- 是Docker的用户端，可以接受用户命令和配置标识，并与Docker daemon通信。
- Images（镜像）： 	 				
	- 是一个只读模板，含创建Docker容器的说明，它与操作系统的安装光盘有点像。
- Containers（容器）： 
	- 镜像的运行实例，镜像与容器的关系类比面向对象中的类和对象。
- Registry（仓库）： 
	- 是一个集中存储与分发镜像的服务。最常用的Registry是官方的Docker Hub 。

### Dockerz组件
- Docker客户端和服务器
- Dokcer镜像
- Registry
- Docker容器

### Docker容器就是
- 一个镜像格式
- 一系列标准的操作
- 一个知性环境

### Docker常用命令

#### 镜像控制
- docker  search  [OPTIONS]  TERM // 搜索镜像
- docker  push  [OPTIONS]  NAME[:TAG] // 上传镜像
- docker  pull  [OPTIONS]  NAME[:TAG] // 下载镜像
- docker  commit [OPTIONS]  CONTAINER  NAME[:TAG] // 提交镜像
- docker  build  [OPTIONS]  PATH // 构建镜像
- docker  rmi [OPTIONS]  IMAGE  [IMAGE...] // 删除镜像
- docker  tag  SOURCE_IMAGE[:TAG]  TARGET_IMAGE[:TAG] // 增加镜像标签
- docker  images  [OPTIONS]  [REPOSITORY[:TAG]] // 查看所有镜像

#### 容器控制
- docker start/restart CONTAINER // 启动/重启容器
- docker stop/ kill CONTAINER // 停止/强停容器
- docker rm [OPTIONS] CONTAINER [CONTAINER...] // 删除容器(需要容器是停止的)
- docker rename CONTAINER CONTAINER_NEW // 重命名容器
- docker attach CONTAINER // 进入容器
- docker exec CONTAINER COMMAND // 执行容器命令
- docker -f logs [OPTIONS] CONTAINER // 查看容器日志，[-f]用来监控docker日志
- docker ps [OPTIONS] // 查看容器列表
- sudo docker inspect CONTAINER // 容器具体信息
- sudo docker top CONTAINER // 查看容器内的进程


#### 容器启动
- docker  run  [OPTIONS]  IMAGE  [COMMAND]  [ARG...]
	- -d : 后台运行容器，并返回容器ID
	- -i：以交互模式运行容器，通常与 -t 同时使用	
	- -t：为容器重新分配一个伪输入终端，通常与 -i 同时使用
	- -v：绑定挂载目录
	- --name="mycontainer": 为容器指定一个名称
	- --net="bridge": 指定容器的网络连接类型
	
#### 其他命令
- sudo docker info // 确保Docker已经就绪，查看docker信息
- docker run --help // docker命令帮助
- docker cp custom.conf Nginx:/etc/nginx/conf.d/ // 复制文件到容器
- docker container update --restart=always nginx // 更新容器启动项
- tail -f /var/log/messages // 查看docker日志

### 有三种方式可以指代唯一容器
- UUID(如：db4deb80d1c4)
- 长UUID(如：db4ddb4deb80d1c4edb4db4deb80d1c4deb80d1c4b80d1c4)
- 名称(如：my_cat)


## Node.js相关

### Node.js能做什么
- 具有复杂逻辑的网站；
- 基于社交网络的大规模 Web 应用；
- Web Socket 服务器；
- TCP/UDP 套接字应用程序；
- 命令行工具；
- 交互式终端程序；
- 带有图形用户界面的本地应用程序；
- 单元测试工具；
- 客户端 JavaScript 编译器。

### supervisor 会监视你对代码的改动，并自动重启 Node.js。
- npm install -g supervisor // 安裝 supervisor
- supervisor app.js // 使用 supervisor 命令启动 app.js

### 同步式 I/O 和异步式 I/O 的特点
|同步式 I/O（阻塞式）|异步式 I/O（非阻塞式）|
|----|----|
|利用多线程提供吞吐量|单线程即可实现高吞吐量|
|通过事件片分割和线程调度利用多核CPU|通过功能划分利用多核CPU|
|需要由操作系统调度多线程使用多核 CPU|可以将单进程绑定到单核 CPU|
|难以充分利用 CPU 资源|可以充分利用 CPU 资源|
|内存轨迹大，数据局部性弱|内存轨迹小，数据局部性强|
|符合线性的编程思维|不符合传统编程思维|

### 严格符合 CommonJS 规范的包应该具备以下特征：
- package.json 必须在包的顶层目录下；
- 二进制文件应该在 bin 目录下；
- JavaScript 代码应该在 lib 目录下；
- 文档应该在 doc 目录下；
- 单元测试应该在 test 目录下。
	- Node.js 对包的要求并没有这么严格，只要顶层目录下有 package.json，并符合一些规范即可。

### package.json 是 CommonJS 规定的用来描述包的文件，完全符合规范的 package.json 文件应该含有以下字段。
- name ：包的名称，必须是唯一的，由小写英文字母、数字和下划线组成，不能包含空格。
- description ：包的简要说明。
- version ：符合语义化版本识别规范的版本字符串。
- keywords ：关键字数组，通常用于搜索。
- maintainers ：维护者数组，每个元素要包含 name 、 email （可选）、 web （可选）字段。
- contributors ：贡献者数组，格式与 maintainers 相同。包的作者应该是贡献者数组的第一个元素。
- bugs ：提交bug的地址，可以是网址或者电子邮件地址。
- licenses ：许可证数组，每个元素要包含 type （许可证的名称）和  url （链接到许可证文本的地址）字段。
- repositories ：仓库托管地址数组，每个元素要包含 type  （仓库的类型，如  git ）、url （仓库的地址）和  path （相对于仓库的路径，可选）字段。
- dependencies ：包的依赖，一个关联数组，由包名称和版本号组成。

### 本地模式与全局模式
|模 式|可通过 require 使用|注册PATH|
|----|----|----|
|本地模式|是|否|
|全局模式|否|是|
- 当我们要把某个包作为工程运行时的一部分时，通过本地模式获取，如果要
在命令行下使用，则使用全局模式安装。

### Node.js 调试命令
|命 令|功 能|
|----|----|
|run|执行脚本，在第一行暂停|
|restart|重新执行脚本|
|cont, c|继续执行，直到遇到下一个断点|
|next, n|单步执行|
|step, s|单步执行并进入函数|
|out, o|从函数中步出|
|setBreakpoint(), sb()|在当前行设置断点|
|setBreakpoint(‘f()’), sb(...)|在函数f的第一行设置断点|
|setBreakpoint(‘script.js’, 20), sb(...)|在 script.js 的第20行设置断点|
|clearBreakpoint, cb(...)|清除所有断点|
|backtrace, bt|显示当前的调用栈|
|list(5)|显示当前执行到的前后5行代码|
|watch(expr)|把表达式 expr 加入监视列表|
|unwatch(expr)|把表达式 expr 从监视列表移除|
|watchers|显示监视列表中所有的表达式和值|
|repl|在当前上下文打开即时求值环境|
|kill|终止当前执行的脚本|
|scripts|显示当前已加载的所有脚本|
|version|显示 V8 的版本|

### 全局对象
- process：用于描述当前 Node.js 进程状态的对象，提供了一个与操作系统的简单接口。
- console  用于提供控制台标准输出，它是由 Internet Explorer 的 JScript 引擎提供的调试工具，后来逐渐成为浏览器的事实标准。Node.js沿用了这个标准，提供与习惯行为一致的
console 对象，用于向标准输出流（ stdout ）或标准错误流（ stderr ）输出字符。

### 常用工具 util
- util.inherits(constructor, superConstructor) 是一个实现对象间原型继承的函数。
- util.inspect(object,[showHidden],[depth],[colors]) 是一个将任意对象转换为字符串的方法，通常用于调试和错误输出。

### 事件驱动 events(略)

### 文件系统 fs
- fs 模块是文件操作的封装，它提供了文件的读取、写入、更名、删除、遍历目录、链接等 POSIX 文件系统操作。fs 模块中所有的操作都提供了异步的和
同步的两个版本
#### fs 模块函数表
|功 能|异步函数|同步函数|
|----|----|----|
|打开文件|fs.open(path,flags, [mode], [callback(err,fd)])|fs.openSync(path, flags, [mode])|
|关闭文件|fs.close(fd, [callback(err)])|fs.closeSync(fd)|
|读取文件（文件描述符）|fs.read(fd,buffer,offset,length,position,[callback(err, bytesRead, buffer)])|fs.readSync(fd, buffer, offset,length, position)|
|写入文件（文件描述符）|fs.write(fd,buffer,offset,length,position,[callback(err, bytesWritten, buffer)])|fs.writeSync(fd, buffer, offset,length, position)|
|读取文件内容|fs.readFile(filename,[encoding],[callback(err, data)])|fs.readFileSync(filename,[encoding])|
|写入文件内容|fs.writeFile(filename, data,[encoding],[callback(err)])|fs.writeFileSync(filename, data,[encoding])|
|删除文件|fs.unlink(path, [callback(err)])|fs.unlinkSync(path)|
|创建目录|fs.mkdir(path, [mode], [callback(err)])|fs.mkdirSync(path, [mode])|
|删除目录|fs.rmdir(path, [callback(err)])|fs.rmdirSync(path)|
|读取目录|fs.readdir(path, [callback(err, files)])|fs.readdirSync(path)|
|获取真实路径|fs.realpath(path, [callback(err,resolvedPath)])|fs.realpathSync(path)|
|更名|fs.rename(path1, path2, [callback(err)])|fs.renameSync(path1, path2)|
|截断|fs.truncate(fd, len, [callback(err)])|fs.truncateSync(fd, len)|
|更改所有权|fs.chown(path, uid, gid, [callback(err)])|fs.chownSync(path, uid, gid)|
|更改所有权（文件描述符）|fs.fchown(fd, uid, gid, [callback(err)])|fs.fchownSync(fd, uid, gid)|
|更改所有权（不解析符号链接）|fs.lchown(path, uid, gid, [callback(err)])|fs.lchownSync(path, uid, gid)|
|更改权限|fs.chmod(path, mode, [callback(err)])|fs.chmodSync(path, mode)|
|更改权限（文件描述符）|fs.fchmod(fd, mode, [callback(err)])|fs.fchmodSync(fd, mode)|
|更改权限（不解析符号链接）|fs.lchmod(path, mode, [callback(err)])|fs.lchmodSync(path, mode)|
|获取文件信息|fs.stat(path, [callback(err, stats)])|fs.statSync(path)|
|获取文件信息（文件描述符）|fs.fstat(fd, [callback(err, stats)])|fs.fstatSync(fd)|
|获取文件信息（不解析符号链接）|fs.lstat(path, [callback(err, stats)])|fs.lstatSync(path)|
|创建硬链接|fs.link(srcpath, dstpath, [callback(err)])|fs.linkSync(srcpath, dstpath)|
|创建符号链接|fs.symlink(linkdata, path, [type],[callback(err)])|fs.symlinkSync(linkdata, path,[type])|
|读取链接|fs.readlink(path, [callback(err,linkString)])|fs.readlinkSync(path)|
|修改文件时间戳|fs.utimes(path, atime, mtime, [callback(err)])|fs.utimesSync(path, atime, mtime)|
|修改文件时间戳（文件描述符）|fs.futimes(fd, atime, mtime, [callback(err)])|fs.futimesSync(fd, atime, mtime)|
|同步磁盘缓存|fs.fsync(fd, [callback(err)])|fs.fsyncSync(fd)|

### HTTP服务器与客户端
