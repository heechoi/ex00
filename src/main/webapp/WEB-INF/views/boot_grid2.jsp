<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
	header{
		height:100px;
		background: rgba(125,211,242,0.5);
		border-radius:15px;
		padding:10px;
		margin:10px 0;
		text-align: center; 
	}
	ul.nav{
		background: rgba(201,201,201,0.5);
		padding:10px;
		border-radius:10px;
	}
	footer{
		text-align: center;
		border-top: 1px solid gray;
		padding:10px;
	}
</style>
</head>
<body>
	<div class="container">
		<header>
			<h2>그리드 시스템을 이용한 레이아웃</h2>
		</header>
		<section>
			<div class="row">
				<div class="col-md-2">
					<ul class="nav">
						<li>menu1</li>
						<li>menu2</li>
						<li>menu3</li>
						<li>menu4</li>
					</ul>
				</div>
				<div class="col-md-10">
					<p> 대투수 출신이고 투수코치 경험도 풍부한 만큼, 투수에 대해 나름의 기준을 갖고 계실 것 같은데요.
					첫 번째 기준은 제구력입니다. 투수 본인이 생각하는 제구도 있지만, 더그아웃이나 다른 사람들이 볼 때 편안한 느낌이 들어야 해요. 
					스트라이크를 던지는 기본적 제구가 되어야 하고 타자와 카운트 싸움에서 자신이 원하는 공을 생각대로 던질 수 있는 제구가 되는 투수를 우선순위로 둘 겁니다. 그다음에는 구위나 다른 요소를 따져봐야겠죠. 
					또 한 가지 관심이 가는 건 외야 구성입니다. 제러드 호잉과 이용규가 외야 두 자리를 차지할 것으로 보이는데, 
					나머지 한 자리를 누가 차지하게 될지 궁금합니다.
					투수 쪽이 정말 무한경쟁이라면, 야수 쪽은 그래도 어느 정도 자리가 잡혀있다 생각합니다. 
					지금 생각으로는 최진행이 당연히 좌익수를 봐야 한다고 보고요, 나머지는 상황에 맞게 기용할 생각입니다.
					결국 올 시즌 한화 성적도 외국인 선수 활약에 크게 좌우될 것 같습니다. 
					사실 작년에 뛴 알렉시 오간도, 카를로스 비야누에바, 윌린 로사리오의 몸값과 이름값이 워낙 대단했던지라, 올해 외국인 트리오가 상대적으로 ‘초라’해 보이는 면도 있습니다.
					가성비가 좋길 바랄 뿐이죠. (웃음) 제 기준을 얘기하자면 경력보다는 앞으로의 발전성, 그리고 내구성을 생각했어요. 특히 선발투수의 경우 건강한 선수를 뽑아야 한다고 생각했습니다.
					 팀이 한 시즌 톱니바퀴가 잘 맞아 돌아가야 하는데, 누군가 아프기 시작하면 한 번에 무너질 수 있으니까요. 지금까지 연습하는 모습을 보면, 충분히 잘 뽑은 것 같습니다.
					한신 타이거즈에 진출한 로사리오가 연일 홈런을 때려내며 찬사를 받던데, 호잉이 그만큼 해줄 수 있을까요.</p>
				</div>
			</div>
		</section>
		<footer>footer가 들어가는 자리</footer>
	</div>
</body>
</html>