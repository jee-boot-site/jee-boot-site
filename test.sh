curl http://localhost:9090/  |iconv -f UTF-8
curl -X POST  --data-ascii "loginName=thinkgem&password=admin" http://localhost:9090/login |iconv -f UTF-8