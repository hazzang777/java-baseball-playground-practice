## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```

## 요구 사항 분석

---

1. 유효성 검사
   1. 1 ~ 9의 숫자 인가?
   2. 중복 값이 있는가?
   3. 3자리 인가?

2. 야구 볼 체크
   1. 낫싱
   2. 볼
   3. 스트라이크  

com 1 2 3 / user 4 5 6 : 낫싱  
com 1 2 3 / user 4 1 5 : 원 볼  
com 1 2 3 / user 1 4 5 : 원 스트라이크

* 1 step : (위치 값, 야구 볼)
  * com (1 , 1) / user (1 , 4) : 낫싱
  * com (1 , 1) / user (2 , 1) : 원 볼
  * com (1 , 1) / user (1 , 1) : 원 스트라이크