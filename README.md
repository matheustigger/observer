# Padrão de Projeto: Observer

- Observer é um padrão de projeto de software que define uma dependência um-para-muitos entre objetos de modo que quando um objeto muda o estado, todos os seus dependentes são notificados e atualizados automaticamente.

- O padrão Observer pode ser usado quando uma abstração tem dois aspectos, um dependente do outro. Encapsular tais aspectos em objetos separados permite que variem e sejam reusados separadamente. Quando um objeto requer mudança a outros e você não sabe quantos outros objetos devem mudar ou quando um objeto deve ser capaz de avisar outros sem fazer suposições sobre quem são os outros objetos. 

- O Java também fornece suporte para o padrão de projeto Observer. As API’s mais gerais são a interface Observer e a classe Observable no pacote java.util. 

