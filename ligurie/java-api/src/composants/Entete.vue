<template>
    <div>
<div class="hearder">
    <div class="logo">
        <h4><span>MGIBANK</span></h4>
    </div>
    <ul>
        <router-link to="/"
            ><li>Accueil</li>
        </router-link>
            <router-link to="/create"
            ><li>Create</li>
        </router-link>
         <router-link to="/update"
            ><li>Update</li>
        </router-link>
         <router-link to="/all"
            ><li>Liste des utilisateurs</li>
        </router-link>
    
    </ul>
    
</div>
<h3>Bienvenue sur la page administrateur de <span>MGIBANK</span> </h3>
    </div>
</template>

<script setup>

</script>

<style  scoped>
@import url('https://fonts.googleapis.com/css2?family=Roboto+Mono&display=swap');
.hearder{
    max-width: 1000px;
    width: 100%;
    display: flex;
    justify-content: space-between;
    align-items: center;
    margin: auto;
}
.logo h4{
    margin-top: -8px;
}
.logo h4 span{
    font-family: 'Roboto Mono', monospace;
}
ul{
    display: flex;
    justify-content: center;
    align-items: center;
    gap: 40px;
    list-style: none;
    
    }

    ul >*{
        
        text-decoration: none;
        color:white;
        background-color: black;
        padding: 5px;
        border-radius: 5px;
        border: 1px solid black;
        margin-top: -10px;
        margin-left: 20px;
        margin-right: 20px;
    }
    h3{
        text-align: center;
    }
    span{
        color: blue;
    }
</style>