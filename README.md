# Projeto Bridge - Geração de Documentos

## 📌 Descrição
Projeto desenvolvido em Java utilizando o padrão estrutural Bridge.

O objetivo do sistema é permitir a geração de diferentes tipos de documentos empresariais em múltiplos formatos de saída, desacoplando os documentos dos formatos utilizados.

---

# 🧠 Padrão Utilizado

## Bridge

O padrão Bridge foi utilizado para separar:

- **Abstração → Documentos**
- **Implementação → Formatos de saída**

Isso permite criar novas combinações sem alterar o código existente.

Exemplo:
- Relatório em PDF
- Nota Fiscal em JSON
- Contrato em TXT
- Proposta Comercial em HTML

---

# 📂 Estrutura do Projeto

```text
src/
│
├── abstraction/
│   ├── Documento.java
│   ├── RelatorioGerencial.java
│   ├── NotaFiscal.java
│   ├── PropostaComercial.java
│   └── ContratoSimplificado.java
│
├── implementation/
│   ├── GeradorArquivo.java
│   ├── GeradorTXT.java
│   ├── GeradorHTML.java
│   ├── GeradorPDF.java
│   └── GeradorJSON.java
│
├── concrete/
│   └── Main.java
