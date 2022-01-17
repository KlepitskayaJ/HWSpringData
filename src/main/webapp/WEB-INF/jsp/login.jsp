<form name="f" th:action="@{/perform_login}" method="post">
    <p>
        <label for="username">Firstname</label>
        <input type="text" id="username" name="username"/>
    </p>
    <p>
        <label for="email">Email</label>
        <input type="text" id="email" name="email"/>
    </p>
    <p>
        <label for="password">Password</label>
        <input type="password" id="password" name="password"/>
    </p>
    <button type="submit" class="btn">Log in</button>
</form>