## part3-chapter6

# 쇼핑몰 앱

<img src="https://github.com/soommmin/part3-chapter6/assets/150005268/f78fd010-3800-4a2f-9e8b-1b8efa0e1194" width="200" height="400"/>
<img src="https://github.com/soommmin/part3-chapter6/assets/150005268/53cb3aaf-01c2-4066-bf81-e3e8df44d4f5" width="200" height="400"/>

쇼핑몰 앱은 MVVM 아키텍처를 기반으로 하여 사용자 인터페이스와 비즈니스 로직을 분리함으로써 코드의 가독성과 유지보수성을 향상시켰습니다.
Hilt를 사용하여 의존성 관리를 효율적으로 처리할 수 있으며, Kotlin Coroutine을 활용하여 네트워크 호출과 데이터베이스 액세스 같은 오래 걸리는 작업을 비동기적으로 처리합니다.
Kotlin Flow를 사용하여 데이터의 비동기적인 처리와 반응형 프로그래밍을 구현했습니다. 이를 통해 데이터의 효율적인 처리와 화면 갱신을 관리할 수 있습니다.
Paging3을 통해 대량의 상품 목록을 효율적으로 처리합니다.서버로부터 받아온 데이터를 효율적으로 처리하기 위해 JsonDeserializer를 사용하여 JSON 형식의 데이터를 객체로 변환하였습니다.



## What I Learned
1. [MVVM](https://ko.wikipedia.org/wiki/%EB%AA%A8%EB%8D%B8-%EB%B7%B0-%EB%B7%B0%EB%AA%A8%EB%8D%B8)
   - MVVM 아키텍처는 모델(Model), 뷰(View), 뷰모델(ViewModel) 세 가지 요소로 앱을 구성합니다. 모델은 데이터와 비즈니스 로직을 다루며, 뷰는 사용자 인터페이     스를 나타내고, 뷰모델은 뷰와 모델 간의 통신을 중개하고 비즈니스 로직을 처리합니다. 이를 통해 앱의 각 부분이 독립적으로 유지되며 테스트 및 유지보수가 용이해집니다.
2. [Hilt](https://developer.android.com/training/dependency-injection/hilt-android?hl=ko)
   - Hilt는 안드로이드에서 의존성 주입(Dependency Injection)을 쉽게 구현할 수 있도록 지원하는 라이브러리입니다. 의존성 주입은 객체 간의 의존 관계를 외부에서      관리하여 코드의 결합도를 낮추고 유지보수성을 향상시킵니다. Hilt를 사용하면 코드를 더욱 깔끔하고 테스트 가능하게 만들 수 있습니다.
3. [Coroutine](https://developer.android.com/kotlin/coroutines?hl=ko)
   - Coroutine은 비동기 프로그래밍을 위한 라이브러리로서, 안드로이드 앱에서 네트워크 호출이나 데이터베이스 액세스 등의 작업을 비동기적으로 처리할 수 있게 해줍니다.     Coroutine을 사용하면 콜백 지옥을 피하고 코드를 간결하게 작성할 수 있습니다.
4. [Flow](https://developer.android.com/kotlin/flow?hl=ko)
   - Flow는 Kotlin에서 제공하는 비동기적인 데이터 스트림을 처리하기 위한 라이브러리입니다. Coroutine과 함께 사용되며, 데이터의 연속적인 흐름을 쉽게 다룰 수 있      습니다. 이를 통해 실시간 업데이트가 필요한 데이터를 간단하게 처리할 수 있습니다.
5. [Paging3](https://developer.android.com/topic/libraries/architecture/paging/v3-overview?hl=ko)
   - Paging3는 안드로이드에서 대량의 데이터를 페이징하여 로딩 속도를 최적화하는 데 사용되는 라이브러리입니다. 대용량 데이터를 효율적으로 처리하고 화면에 보여줄 때       메모리 사용량을 최소화하여 사용자 경험을 향상시킵니다.
6. JsonDeserializer
   - JsonDeserializer는 JSON 형식의 데이터를 객체로 변환하는 데 사용됩니다. 이를 통해 네트워크에서 받아온 JSON 데이터를 쉽게 파싱하여 앱 내부에서 사용할 수      있는 형태로 변환할 수 있습니다.

