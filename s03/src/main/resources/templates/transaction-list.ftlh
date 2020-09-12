<html>
  <head>
    <link rel="stylesheet" href="style.css"/>
    <#--
      <#include "style.css">
    -->
  </head>
  <body>
    <h3>Ihre aktuellen Transaktionen</h3>
    <table>
      <tr>
        <th>Titel</th>
        <th>Betrag</th>
      </tr>
      <#list transactions as tx>
        <tr class="<#if (tx.amount > 0)>positive<#else>negative</#if>">
          <td>${tx.description}</td>
          <td>${tx.amount}</td>
        </tr>
      </#list>
    </table>
  </body>
</html>