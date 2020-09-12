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