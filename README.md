# TO DO LIST
> 기본적인 CRUD를 학습하기 위해 일정 관리 서비스를 개발하는 레포지토리입니다.   
> 필요한 기술은 점진적으로 적용할 예정입니다.

## SKILLS
- 프레임워크 : `SpringBoot`
- IDE : `Eclipse`
- 프로그래밍 언어 : `JAVA`(JDK17)
- 빌드 도구 : `Gradle`
- 테스트 도구 : `PostMan`
- 데이터베이스 : `H2-DATABASE`(인메모리), `postgreSql`
- SQL Mapper : `Mybatis`

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
`insertTodo` api 완료   

2025-08-20      
전체조회 api 개발       

2025-08-21   
전체조회 `todoAllList` api 수정(조회 쿼리 추가)   

2025-08-22   
`deleteTodo` api 생성   

2025-08-24   
`updateTodo` api 생성   

# to do 작업 목록
- 페이징 처리 추가(page, size, offset 파라미터 필요)
- `todoAllList` api 조건문 추가
- `updateTodo` api validation 추가
- 상세조회 api 수정
- Swagger를 통해 api 명세서 작성
- render postgresql 사용
- render를 통해 배포
- mybatis log 추가
- dto alias 적용
- 목록 조회 시 조회 조건 추가
- JavaDocs 추가




