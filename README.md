## Guia de Configuração e Análise do Projeto `super-auto-machines`

Este guia detalha os passos para configurar e executar o projeto, além de analisar os principais padrões de projeto utilizados.

### Configuração Inicial do Ambiente

Para iniciar, certifique-se de que as dependências essenciais estão instaladas em seu sistema.

1.  **Pré-requisitos:**
    * Garanta que o **Git** esteja instalado em seu computador.
    * Garanta que o **Java Development Kit (JDK)** esteja instalado (versão 8 ou superior é recomendada).

2.  **Clonagem do Repositório:**
    Copie e utilize um dos links abaixo no seu terminal para clonar o projeto:

    * **HTTPS:**
        ```bash
        git clone [https://github.com/cfyascf/super-auto-machines.git](https://github.com/cfyascf/super-auto-machines.git)
        ```
    * **SSH:**
        ```bash
        git clone git@github.com:cfyascf/super-auto-machines.git
        ```

3.  **Execução do Projeto:**
    Após a clonagem bem-sucedida, você deve compilar e executar o arquivo principal:

    * **Navegue** até o diretório principal do projeto clonado.
    * **Caminhe** até o caminho que contém o arquivo principal:
        ```
        /src/main/java/org.superautomachines/
        ```
    * **Execute** o arquivo `main.java` (A forma exata de compilação e execução pode variar dependendo da sua IDE ou sistema de build, mas o ponto de entrada é este arquivo).

---

### Padrões de Projeto (Design Patterns)

O projeto `super-auto-machines` faz uso de alguns padrões de projeto para aumentar a modularidade, flexibilidade e garantir o controle de instâncias.

#### 1. Dependency Injection (Injeção de Dependência)

* **Localização:** Classe `Game`.
* **Descrição:** Este padrão é aplicado na classe `Game` onde a interface **`IInteraction`** é **injetada** (passada para a classe).
* **Benefício:** Permite a **versatilidade** e **facilidade de substituição** entre diferentes implementações de interação com o usuário (por exemplo, console, GUI, etc.) sem modificar a lógica central do jogo (`Game`).

#### 2. Factory (Fábrica)

* **Localização:** Classe `RandomTeamGenerator`.
* **Descrição:** O padrão Factory é utilizado nesta classe para centralizar a lógica de criação de objetos complexos (times).
* **Benefício:** É extremamente útil para gerar times de **diferentes *tiers*** (níveis/qualidades). Ao centralizar a criação, é mais fácil gerenciar e modificar como os diferentes tipos de times são instanciados.

#### 3. Singleton (Instância Única)

* **Localização:** Classes `Market`, `Match` e `Round`.
* **Descrição:** Este padrão garante que apenas **uma única instância** de uma classe possa existir em toda a aplicação.
* **Benefício:** É implementado nessas classes pois, em um jogo, queremos garantir que haja apenas **um** Mercado de Compras, apenas **uma** Partida em andamento por vez, e apenas **um** Round atual. Isso previne inconsistências de estado no jogo.

#### 4. SOLID (Single Responsability, Open/Closed, Liskov Substitution, Interface Segregation Principles)

* **Localização:** Classes `Match`, `RandomTeamGeneration` e `IInteraction`.
* **Descrição:** A classe **Match** é um bom exemplo de **SingleResponsabilityPrinciple**, a classe **RandomTeamGenerator** é um exemplo claro de **Open/Closed Principle** e **Liskov Substitution Principle** e por último a interface **IInteraction** se encaixa no **Interface Segregation Principle**.
* **Benefício:** Podemos garantir que a resposabilidade seja **única** entre as classes, as classes são **abertas** a extensão e **fechada** para modificação, sub-tipos podem ser **substituíves** por seus tipos base sem **alterar o funcionamento** do programa e por fim clientes **não** são forçados a dependerem de interfaces que não utilizam.
