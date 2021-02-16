const protocol = process.env.REACT_APP_IS_SECURE
    ? process.env.REACT_APP_IS_SECURE
    : 'http';

const game = process.env.REACT_APP_GAME;

export const getGameConnectionString = (server, code, email) =>
    `${protocol}://${server}/codenjoy-contest/board/player/${email}?code=${code}`;

export const getIFrameLink = (server, id) =>
    `${protocol}://${server}/codenjoy-contest/board/player/${id}?only=true`;

export const getJsClient = server =>
    `${protocol}://${server}/codenjoy-contest/resources/user/${game}-servers.zip`;

export const getJavaClient = server =>
    `${protocol}://${server}/codenjoy-contest/resources/user/${game}-servers.zip`;
