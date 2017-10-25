<template>
  <div class="hello">
    <h1>{{ msg }} <b-badge pill variant="success">funciona!</b-badge></h1>
    
  </div>
</template>

<script>
    function getHelloWorld() {
        return "Hello migos AAAAAAAA"
    }
    
export default {
  name: 'hello',
  data () {
    return {
      msg: getHelloWorld()
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
  font-weight: normal;
}

ul {
  list-style-type: none;
  padding: 0;
}

li {
  display: inline-block;
  margin: 0 10px;
}

a {
  color: #42b983;
}
</style>
