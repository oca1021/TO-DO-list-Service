# TO-DO LIST 서비스
일정을 관리하는 서비스를 만들어보면서 백엔드 서버 개발 능력을 늘리기 위한 레포지토리입니다.
## 사용 기술
- 프레임워크 : 스프링부트
- IDE : Eclipse
- 프로그래밍 언어 : JAVA(JDK17)
- 빌드 도구 : Gradle
- 테스트 도구 : PostMan
- 데이터베이스 : H2-DATABASE(인메모리)

## git update
git checkout main   
git pull origin main   
git checkout chaea_8   
git merge main

## 개발 현황
2025-08-16   
3계층 아키텍처 적용   

2025-08-17   
MyBatis 적용   

2025-08-18     
DAO 파일 삭제 후 Service에서 Mapper로 바로 호출 되도록 변경   
Controller에 CrossOrigin 어노테이션 추가   
insertTodo API 반환 타입 ResponseEntity<String>로 변경   
ngrok로 back-end Server 터널링   

2025-08-19   
H2-DataBase(inmemory db) -> postgreSql 변경    
todoitem table 구조 변경 (+ completed 컬럼 추가)   
postgreSql DB안에 todoitem table 생성   
validation 적용   
insertTodo api 완료   

2025-08-20   
전체조회 api 개발   

2025-08-21   
전제조회 api 수정(조회 쿼리 추가)   
