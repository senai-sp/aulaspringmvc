<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="/WEB-INF/cabecalho.jsp" />
<main id="conteudo">
<div class="container">
	<form action="contatoservlet" method="post">
		<h2>Cadastro de Contato</h2>
		<!-- Substitua o esse conjunto por campos do seu formulário -->
		<!-- 
					<div class="grupo">
						<label for="campo1">CAMPO1</label>
						<input type="text" id="campo1" name="campo1">
					</div>
				-->
		<div class="grupo">
			<label for="campo1">NOME</label> <input type="text" id="campo1"
				name="nome">
		</div>

		<div class="grupo">
			<label for="campo2">EMAIL</label> <input type="text" id="campo2"
				name="email">
		</div>

		<div class="grupo">
			<label for="campo3">TELEFONE</label> <input type="text" id="campo3"
				name="telefone">
		</div>

		<div class="grupo">
			<label for="campo4">NASCIMENTO</label> <input class="datepicker"
				type="text" id="campo4" name="nascimento">
		</div>

		<div class="grupo">
			<label for="campo5">SEXO</label> <select id="campo5" name="sexo">
				<option value="MASCULINO">Masculino</option>
				<option value="FEMININO">Feminino</option>
			</select>
		</div>

		<div class="grupo">
			<label for="campo6">LOGRADOURO</label> <input type="text" id="campo6"
				name="endereco.logradouro">
		</div>

		<div class="grupo">
			<label for="campo7">NUMERO</label> <input type="number" id="campo7"
				name="endereco.numero">
		</div>

		<button class="btn btn-cadastrar" type="submit">CADASTRAR</button>
	</form>
</div>
</main>
<!-- END CONTEUDO -->
<c:import url="/WEB-INF/rodape.jsp" />